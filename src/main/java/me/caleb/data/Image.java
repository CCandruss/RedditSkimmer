
package me.caleb.data;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("resolutions")
    @Expose
    private List<Resolution> resolutions = null;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("variants")
    @Expose
    private Variants variants;
    private final static long serialVersionUID = -9112427492401067637L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

}
