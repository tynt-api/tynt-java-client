package com.tynt.api.v1.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Models a Tynt top "category".
 *
 * The Tynt Top Categories API allows users to access a list of the most engaging categories that Tynt analyzes.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class Category {
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    public Category() {
    }

    public Category(String displayName, String name, String url) {
        this.displayName = displayName;
        this.name = name;
        this.url = url;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
