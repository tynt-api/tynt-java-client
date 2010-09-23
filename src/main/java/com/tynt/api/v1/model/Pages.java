package com.tynt.api.v1.model;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Models a collection of Tynt "pages" as well as some meta-data.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class Pages {
    @JsonProperty("pages")
    private List<Page> items;
    @JsonProperty("category")
    private String category;

    public String getCategory() {
        return category;
    }

    public List<Page> getItems() {
        return items;
    }
}
