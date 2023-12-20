package org.nzbhydra.config.safeconfig;

import lombok.Data;
import org.nzbhydra.config.BaseConfig;
import org.nzbhydra.config.indexer.IndexerConfig;
import org.nzbhydra.springnative.ReflectionMarker;

import java.util.List;

@Data
@ReflectionMarker
public class SafeIndexerConfig {

    private String name;
    private boolean preselect;
    private List<String> categories;
    private boolean showOnSearch;
    private String enabledForSearchSource;
    private String searchModuleType;
    private String color;
    private String vipExpirationDate;

    public SafeIndexerConfig(IndexerConfig indexerConfig, BaseConfig baseConfig) {
        this.name = indexerConfig.getName();
        this.preselect = indexerConfig.isPreselect();
        this.categories = indexerConfig.getEnabledCategories();
        this.showOnSearch = indexerConfig.isEligibleForInternalSearch();
        this.enabledForSearchSource = indexerConfig.getEnabledForSearchSource().name();
        this.searchModuleType = indexerConfig.getSearchModuleType().name();
        this.color = indexerConfig.getColor();
        this.vipExpirationDate = indexerConfig.getVipExpirationDate();
    }

}
