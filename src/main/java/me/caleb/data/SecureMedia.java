
package me.caleb.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMedia implements Serializable
{

    @SerializedName("oembed")
    @Expose
    private Oembed_ oembed;
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = 6791580603804541411L;

    public Oembed_ getOembed() {
        return oembed;
    }

    public void setOembed(Oembed_ oembed) {
        this.oembed = oembed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
