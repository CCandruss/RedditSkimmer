package me.caleb.tasks;

import com.google.gson.Gson;
import me.caleb.data.Datum;
import me.caleb.data.Submission;
import me.caleb.App;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RedditPostFetcher extends Thread {

    @Override
    public void run() {
        long epochNow = System.currentTimeMillis();
        epochNow = new PostSelector().removeLastNDigits(epochNow, 3);
        HttpClient client = HttpClient.newHttpClient();
        //state request params
        //uri uniform resource identifier basically just providing link to resource
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.pushshift.io/reddit/search/submission?subreddit=wallstreetbets&limit=100")).build();
        //num_crossposts     Number of times Submission has been crossposted
        //selftext
        //


        //building response and inside of for loop sorting through data to be used
        try {

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
            //just collecting my json
            Submission submissions = new Gson().fromJson(response.body(), Submission.class);

            for (Datum d : submissions.getData()) {
                if (!containsPost(App.getPostList(), d.getId())) {
                    PostSelector check = new PostSelector();
                    if(check.checkPost(d)){
                        App.getPostList().add(d);
                        d.setPostTime((int) epochNow);
                        Files.writeString(Path.of("data/saved_posts.json"), new Gson().toJson(App.getPostList()));
                    }
                }

            }

//                    System.out.println(App.postList.size());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    //searched in google if collection contains object java
    //looking through all of our posts id's to see if it is already in our list returns boolean value
    public boolean containsPost(final List<Datum> posts, final String postId) {
        return posts.stream().anyMatch(post -> post.getId().equals(postId));
    }
}
