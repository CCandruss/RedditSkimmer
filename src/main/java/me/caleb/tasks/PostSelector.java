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
    int timestamp;


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
            if(d.getPostTime() != 0){
                timestamp = d.getPostTime();
                System.out.println((timestamp + postTitle));
                System.out.println((id));

            }
//            long epochNow = System.currentTimeMillis();
//            epochNow = removeLastNDigits(epochNow, 3);

//            System.out.println(epochNow  - (14400*3) + "math");

//            if(retrievedOn <= (epochNow - (14400*8)) && retrievedOn >= (epochNow - (14400*6))){
//                System.out.println(d.getTitle() + "    timestamp: 24-32 hours");
//            }
//            if(retrievedOn < (epochNow - (14400*2)) && retrievedOn >= (epochNow - (14400))){
//                System.out.println(d.getTitle() + "    timestamp: 8 hours or more");
//            }
//            if(retrievedOn < (epochNow - (14400*3)) && retrievedOn >= (epochNow - (14400*2))){
//                System.out.println(d.getTitle() + "    timestamp: 12 hours or more");
//            }
//            if(retrievedOn < (epochNow - (14400*4)) && retrievedOn >= (epochNow - (14400*3))){
//                System.out.println(d.getTitle() + "    timestamp: 16 hours or more");
//            }
//            if(retrievedOn <= (epochNow - (14400*5)) && retrievedOn >= (epochNow - (14400*4))){
//                System.out.println(d.getTitle() + "    timestamp: 20 hours or more");
//            }
//            if(retrievedOn <= (epochNow - (14400*6))){
//                System.out.println(d.getTitle() + "    timestamp: 24 hours or more");
//            }

        }
    }

    long removeLastNDigits(long x, long n) {
        return (long) (x / Math.pow(10, n));
    }



}
