package dev.logchange.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChangelogEntryType {

    ADDED("added"),
    CHANGED("changed"),
    DEPRECATED("deprecated"),
    REMOVED("removed"),
    FIXED("fixed"),
    SECURITY("security");

    private final String type;

}
