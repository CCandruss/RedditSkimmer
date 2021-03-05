package me.caleb;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.sun.tools.javac.Main;
import me.caleb.data.Datum;
import me.caleb.data.Submission;
import me.caleb.tasks.RedditPostFetcher;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.nio.file.Files;
import java.nio.file.Path;

import me.caleb.tasks.*;


public class App {

    private static Logger log = LogManager.getLogger(App.class.getName());
    private static ArrayList<Datum> postList = new ArrayList<Datum>();

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        File savedPosts = new File("data/saved_posts.json");

        if (!savedPosts.exists()) {
            try {
                FileWriter writer = new FileWriter("data/saved_posts.json");
                writer.close();
            } catch (Exception e) {
                log.error("Error Writing File :: " + e.getLocalizedMessage());
            }
        }

        if (savedPosts.exists() && savedPosts.length() > 0) {
            String actual = Files.readString(Path.of("data/saved_posts.json"));
            Type postListType = new TypeToken<ArrayList<Datum>>(){}.getType();
            postList = new Gson().fromJson(actual, postListType );
            System.out.println(actual);
        }

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(100);

        ScheduledFuture retrievePosts = scheduler.scheduleAtFixedRate(
                new RedditPostFetcher(), 1, 2, TimeUnit.SECONDS);

        ScheduledFuture checkPostCollectionStatus = scheduler.scheduleAtFixedRate(
                new PostCollectionChecker(), 1, 20, TimeUnit.SECONDS);

    }

    public static ArrayList<Datum> getPostList() {
        return postList;
    }

    public static void setPostList(ArrayList<Datum> postList) {
        App.postList = postList;
    }
}

