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
public class Page {

    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String urlText;
    @JsonProperty("image")
    private String imageUrlText;
    @JsonProperty("content")
    private String content;
    @JsonProperty("copies")
    private Long copies;
    @JsonProperty("page_views")
    private Long pageViews;
    @JsonProperty("tynt_score")
    private Integer tyntScore;

    public String getTitle() {
        return title;
    }

    public String getUrlText() {
        return urlText;
    }

    public URL getUrl() throws MalformedURLException {
        return new URL(urlText);
    }

    public String getImageUrlText() {
        return imageUrlText;
    }

    public URL getImageUrl() throws MalformedURLException {
        return new URL(imageUrlText);
    }

    public String getContent() {
        return content;
    }

    public Long getCopies() {
        return copies;
    }

    public Long getPageViews() {
        return pageViews;
    }
    
    public Integer getTyntScore() {
        return tyntScore;
    }
}
