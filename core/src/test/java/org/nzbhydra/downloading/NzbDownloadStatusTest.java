package org.nzbhydra.downloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NzbDownloadStatusTest {

    @Test
    void testCanUpdate() {
        assertTrue(FileDownloadStatus.NZB_ADDED.canUpdate(FileDownloadStatus.NONE));
        assertTrue(FileDownloadStatus.NZB_ADDED.canUpdate(FileDownloadStatus.REQUESTED));
        assertTrue(FileDownloadStatus.NZB_DOWNLOAD_SUCCESSFUL.canUpdate(FileDownloadStatus.REQUESTED));
        assertTrue(FileDownloadStatus.NZB_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.NONE));
        assertTrue(FileDownloadStatus.NZB_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.REQUESTED));
        assertTrue(FileDownloadStatus.NZB_ADD_REJECTED.canUpdate(FileDownloadStatus.REQUESTED));
        assertTrue(FileDownloadStatus.NZB_ADD_REJECTED.canUpdate(FileDownloadStatus.NZB_DOWNLOAD_SUCCESSFUL));
        assertTrue(FileDownloadStatus.CONTENT_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.NONE));
        assertTrue(FileDownloadStatus.CONTENT_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.NZB_DOWNLOAD_SUCCESSFUL));
        assertTrue(FileDownloadStatus.CONTENT_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.NZB_ADDED));
        assertTrue(FileDownloadStatus.CONTENT_DOWNLOAD_ERROR.canUpdate(FileDownloadStatus.REQUESTED));
    }


}
