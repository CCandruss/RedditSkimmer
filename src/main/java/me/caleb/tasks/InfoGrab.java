package me.caleb.tasks;

import com.google.gson.Gson;
import me.caleb.App;
import me.caleb.data.Datum;
import me.caleb.data.Submission;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;



//class for updating Datum info to be reevaluated
public class InfoGrab {
    public void getUpdate(String postId) {
        HttpClient client2 = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.pushshift.io/reddit/submission/search/?ids="+postId)).build();
        //building response and inside of for loop sorting through data to be used
        try {

            HttpResponse<String> response =
                    client2.send(request, HttpResponse.BodyHandlers.ofString());
            //just collecting my json
            Submission submissions = new Gson().fromJson(response.body(), Submission.class);

            for(Datum d: submissions.getData()){
                System.out.println(d.getTitle());
//                if(new RedditPostFetcher().containsPost(App.getPostList(), d.getId())){
//                    System.out.println(d.getTitle() + "  " + d.getNumComments()+ "  " +d.getRetrievedOn());
////                    App.getPostList().set(App.getPostList().indexOf(d),d);
//                }
            }
//                    System.out.println(App.postList.size());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//
//           for (Datum d : submissions.getData()) {
//                   if (!containsPost(App.getPostList(), d.getId())) {
//                   PostSelector check = new PostSelector();
//                   if(check.checkPost(d)){
//                   App.getPostList().add(d);
//                   System.out.println(d.getTitle());
//                   Files.writeString(Path.of("data/saved_posts.json"), new Gson().toJson(App.getPostList()));
//                   }
//                   }
//
//                   }