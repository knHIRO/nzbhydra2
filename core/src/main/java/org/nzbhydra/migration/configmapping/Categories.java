
package org.nzbhydra.migration.configmapping;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.nzbhydra.springnative.ReflectionMarker;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ReflectionMarker
public class Categories {

    @JsonProperty("categories")
    public Map<String, Category> categories = new HashMap<>();
    @JsonProperty("enableCategorySizes")
    public boolean enableCategorySizes;

}
