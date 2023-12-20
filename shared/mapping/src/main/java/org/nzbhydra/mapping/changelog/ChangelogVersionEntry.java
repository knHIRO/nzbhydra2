package org.nzbhydra.mapping.changelog;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nzbhydra.mapping.SemanticVersion;
import org.nzbhydra.springnative.ReflectionMarker;

import java.util.List;

@Data
@ReflectionMarker
@AllArgsConstructor
@NoArgsConstructor
public class ChangelogVersionEntry implements Comparable<ChangelogVersionEntry> {

    private String version;
    private String date;
    private boolean isFinal;
    private List<ChangelogChangeEntry> changes;

    @Override
    public int compareTo(ChangelogVersionEntry o) {
        return new SemanticVersion(version).compareTo(new SemanticVersion(o.getVersion()));
    }

    @JsonIgnore
    public SemanticVersion getSemanticVersion() {
        return new SemanticVersion(version);
    }
}
