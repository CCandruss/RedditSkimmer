
package me.caleb.data;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Submission implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = -6337908626820611498L;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
