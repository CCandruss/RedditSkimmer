
package me.caleb.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinkFlairRichtext implements Serializable
{

    @SerializedName("e")
    @Expose
    private String e;
    @SerializedName("t")
    @Expose
    private String t;
    private final static long serialVersionUID = 4239538879948847154L;

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

}
