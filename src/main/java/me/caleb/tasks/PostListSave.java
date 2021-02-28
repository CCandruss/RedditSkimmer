package me.caleb.tasks;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import me.caleb.data.Datum;
import me.caleb.hi;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;

public class PostListSave {
    String json = hi.getPostList().toString();
    JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();



}
