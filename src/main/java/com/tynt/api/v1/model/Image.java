package com.tynt.api.v1.model;

import java.net.MalformedURLException;
import java.net.URL;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Models a Tynt "page" entity.
 *
 * A Tynt Page is a basic data type that holds information about a web page that is analyzed by Tynt.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class Image {

    @JsonProperty("url")
    private String pageUrlText;
    @JsonProperty("image")
    private String imageUrlText;
    @JsonProperty("tynt_score")
    private Integer tyntScore;

    public String getPageUrlText() {
        return pageUrlText;
    }

    public URL getPageUrl() throws MalformedURLException {
        return new URL(pageUrlText);
    }

    public String getImageUrlText() {
        return imageUrlText;
    }

    public URL getImageUrl() throws MalformedURLException {
        return new URL(imageUrlText);
    }

    public Integer getTyntScore() {
        return tyntScore;
    }
}
