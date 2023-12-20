/*
 *  (C) Copyright 2017 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.nzbhydra.downloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.nzbhydra.config.BaseConfig;
import org.nzbhydra.config.ConfigProvider;
import org.nzbhydra.downloading.downloaders.Downloader;
import org.nzbhydra.downloading.downloaders.Downloader.StatusCheckType;
import org.nzbhydra.downloading.downloaders.DownloaderProvider;
import org.nzbhydra.searching.db.SearchResultEntity;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class DownloadStatusUpdaterTest {

    @Mock
    private DownloaderProvider downloaderProvider;
    @Mock
    private FileDownloadRepository downloadRepository;
    @Mock
    private Downloader downloaderMock;
    @Mock
    private ConfigProvider configProvider;

    @InjectMocks
    private DownloadStatusUpdater testee;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(downloaderProvider.getAllDownloaders()).thenReturn(Collections.singletonList(downloaderMock));
        when(downloaderMock.isEnabled()).thenReturn(true);
        when(configProvider.getBaseConfig()).thenReturn(new BaseConfig());
    }

    @Test
    void shouldNotRunWhenNotEnabled() {
        testee.queueCheckEnabled = false;
        testee.lastDownload = Instant.now();
        testee.checkStatus(Collections.singletonList(FileDownloadStatus.REQUESTED), 10000, StatusCheckType.QUEUE);
        verifyNoMoreInteractions(downloadRepository);
    }

    @Test
    void shouldNotRunWhenLastDownloadTooLongGone() {
        testee.queueCheckEnabled = true;
        testee.lastDownload = Instant.ofEpochSecond(1L);
        testee.checkStatus(Collections.singletonList(FileDownloadStatus.REQUESTED), 10000, StatusCheckType.HISTORY);
        verifyNoMoreInteractions(downloadRepository);
    }

    @Test
    void shouldSetDisabledAndNotRunIfNoDownloadsInDatabase() {
        testee.historyCheckEnabled = true;
        testee.lastDownload = Instant.now();
        List<FileDownloadStatus> statuses = Collections.singletonList(FileDownloadStatus.REQUESTED);
        when(downloadRepository.findByStatusInAndTimeAfterOrderByTimeDesc(eq(statuses), any())).thenReturn(Collections.emptyList());

        testee.checkStatus(statuses, 10000, StatusCheckType.HISTORY);
        assertThat(testee.historyCheckEnabled).isFalse();
    }

    @Test
    void shouldCallDownloader() {
        testee.historyCheckEnabled = true;
        testee.lastDownload = Instant.now();
        List<FileDownloadStatus> statuses = Collections.singletonList(FileDownloadStatus.REQUESTED);
        List<FileDownloadEntity> downloadsWaitingForUpdate = Collections.singletonList(new FileDownloadEntity());
        when(downloadRepository.findByStatusInAndTimeAfterOrderByTimeDesc(eq(statuses), any())).thenReturn(downloadsWaitingForUpdate);
        List<FileDownloadEntity> downloadsReturnedFromDownloader = Collections.singletonList(new FileDownloadEntity());
        when(downloaderMock.checkForStatusUpdates(any(), eq(StatusCheckType.HISTORY))).thenReturn(downloadsReturnedFromDownloader);

        testee.checkStatus(statuses, 10000, StatusCheckType.HISTORY);

        verify(downloaderMock).checkForStatusUpdates(downloadsWaitingForUpdate, StatusCheckType.HISTORY);
        verify(downloadRepository).saveAll(downloadsReturnedFromDownloader);
    }

    @Test
    void shouldSetEnabledOnDownloadEvent() {
        testee.queueCheckEnabled = false;
        testee.lastDownload = null;

        testee.onNzbDownloadEvent(new FileDownloadEvent(new FileDownloadEntity(), new SearchResultEntity()));

        assertTrue(testee.queueCheckEnabled);
        assertThat(testee.lastDownload).isNotNull();
    }

}
