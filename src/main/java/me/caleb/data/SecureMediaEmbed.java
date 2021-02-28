
package me.caleb.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMediaEmbed implements Serializable
{

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("media_domain_url")
    @Expose
    private String mediaDomainUrl;
    @SerializedName("scrolling")
    @Expose
    private Boolean scrolling;
    @SerializedName("width")
    @Expose
    private Integer width;
    private final static long serialVersionUID = -7022971821095906721L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getMediaDomainUrl() {
        return mediaDomainUrl;
    }

    public void setMediaDomainUrl(String mediaDomainUrl) {
        this.mediaDomainUrl = mediaDomainUrl;
    }

    public Boolean getScrolling() {
        return scrolling;
    }

    public void setScrolling(Boolean scrolling) {
        this.scrolling = scrolling;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}
