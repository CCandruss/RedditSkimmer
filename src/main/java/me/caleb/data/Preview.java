
package me.caleb.data;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preview implements Serializable
{

    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    private final static long serialVersionUID = -7675641274676443352L;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
