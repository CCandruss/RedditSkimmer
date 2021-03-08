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
    public void getUpdate(int postId) {
        HttpClient client = HttpClient.newHttpClient();
        //state request params
        //uri uniform resource identifier basically just providing link to resource
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.pushshift.io/reddit/search/submission?id="+postId)).build();
        //num_crossposts     Number of times Submission has been crossposted
        //selftext
        //


        //building response and inside of for loop sorting through data to be used
        try {

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
            //just collecting my json
            Submission submissions = new Gson().fromJson(response.body(), Submission.class);

            for(Datum d: submissions.getData()){
                if(new RedditPostFetcher().containsPost(App.getPostList(), d.getId())){
                    App.getPostList().set(App.getPostList().indexOf(d),d);
                    System.out.println(d.getTitle()+ "  " +d.getRetrievedOn());
                }
            }


//                    System.out.println(App.postList.size());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
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