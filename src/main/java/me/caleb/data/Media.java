
package me.caleb.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media implements Serializable
{

    @SerializedName("oembed")
    @Expose
    private Oembed oembed;
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = 2023731758057803477L;

    public Oembed getOembed() {
        return oembed;
    }

    public void setOembed(Oembed oembed) {
        this.oembed = oembed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
