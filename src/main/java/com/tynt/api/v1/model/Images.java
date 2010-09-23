package com.tynt.api.v1.model;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Models a collection of Tynt "pages" as well as some meta-data.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class Images {
    @JsonProperty("images")
    private List<Image> items;
    @JsonProperty("category")
    private String category;

    public String getCategory() {
        return category;
    }

    public List<Image> getItems() {
        return items;
    }
}
