package me.caleb;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.sun.tools.javac.Main;
import me.caleb.data.Datum;
import me.caleb.data.Submission;
import me.caleb.tasks.RedditPostFetcher;
import org.json.JSONArray;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import me.caleb.tasks.*;


public class hi {


    private static ArrayList<Datum> postList = new ArrayList<Datum>();

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
//        //create http client
//        HttpClient client = HttpClient.newHttpClient();
//        //state request params
//        //uri uniform resource identifier basically just providing link to resource
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.pushshift.io/reddit/search/submission?subreddit=wallstreetbets&limit=100")).build();
//
//        //building response and returning it as a string
//        HttpResponse<String> response =
//                client.send(request, HttpResponse.BodyHandlers.ofString());
//        //list is a collection and the arrows content is the kind of data in the list
//        List<Datum> postsWithText = new ArrayList<Datum>();
//
//        //jsonschema2pojo to generate our string into java objects.
//        //essentially we fed it the string and it converted it to an object reference of sorts that when subsequent strings of json data get plugged into that
//        //we can then convert these new strings to json using the class name we plugged in used to decide our root object
//        //our first argument is the text we will be feeding in the second is essentially the class we wanna cast to
//        Submission submissions = new Gson().fromJson(response.body(), Submission.class);
//
//
//        for (Datum d : submissions.getData()) {
//            String postText = d.getSelftext();
//            if (postText != null && !postText.equalsIgnoreCase("[removed]") && postText.length() > 100) {
//                postsWithText.add(d);
//                System.out.println("Post Content :: " + postText);
//                continue;
//            }
//        }
//
//        System.out.println(postsWithText.size());

        //this is our setTimeout thing
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
        hi.postList = postList;
    }
}

