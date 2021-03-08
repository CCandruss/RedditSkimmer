package me.caleb.tasks;

import com.google.gson.Gson;
import me.caleb.App;
import me.caleb.data.Datum;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class PostSelector {
    String postTitle;
    String postText;
    String id ;
    int totalAwardsReceived;
    int numComments;
    Double upVoteRatio;
    long retrievedOn;


    public Boolean checkPost(Datum post){
        postTitle = post.getTitle();
        postText = post.getSelftext();
        id = post.getId();
        totalAwardsReceived = post.getTotalAwardsReceived();
        numComments = post.getNumComments();

        if(postText != null && !postText.equalsIgnoreCase("[removed]")&& !postText.equalsIgnoreCase("[deleted]") && postText.length() > 10){
            return true;
        } else {
            return false;
        }
    }

    public void filterForRelevance(){

        for (Datum d : App.getPostList()) {
            postTitle = d.getTitle();
            postText = d.getSelftext();
            id = d.getId();
            totalAwardsReceived = d.getTotalAwardsReceived();
            numComments = d.getNumComments();
            upVoteRatio = d.getUpvoteRatio();
            retrievedOn = d.getRetrievedOn();
            long epochNow = System.currentTimeMillis();
            epochNow = removeLastNDigits(epochNow, 3);


            System.out.println(retrievedOn);
            System.out.println(epochNow + "now");

            if(retrievedOn > (epochNow + 14400000)){
                System.out.println(d.getTitle() + "pay attention to me");
            }
        }
    }

    long removeLastNDigits(long x, long n) {
        return (long) (x / Math.pow(10, n));
    }



}
