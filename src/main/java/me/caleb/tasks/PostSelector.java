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
                long epochNow = System.currentTimeMillis();
                epochNow = removeLastNDigits(epochNow, 3);
                int timeGap = (int) (epochNow - timestamp);
//                System.out.println(postTitle + "    " + timeGap);
                if(timeGap < 14400){
                    System.out.println("just a wee babe");
                }
                if(timeGap < 28800 && timeGap > 14400){
                    System.out.println(d.getTitle() + "    timestamp: 4-8hours");
                }
                if(timeGap < 43200 && timeGap >28800){
                    System.out.println(d.getTitle() + "    timestamp: 8-12" );
                }
                if(timeGap < 57600 && timeGap >43200){
                    System.out.println(d.getTitle() + "    timestamp: 12-16" );
                }
                if(timeGap < 72000 && timeGap >57600){
                    System.out.println(d.getTitle() + "    timestamp: 16-20" );
                }
                if(timeGap < 86400 && timeGap >72000){
                    System.out.println(d.getTitle() + "    timestamp: 20-24" );
                }

                //next move is figure out gaps for each hour marker I want but for now fuck all dat you feel me....
//                if(timestamp < (epochNow - (14400*4)) && timestamp >= (epochNow - (14400*3))){
//                    System.out.println(d.getTitle() + "    timestamp: 12-16 hours");
//                }
//                if(timestamp < (epochNow - (14400*5)) && timestamp >= (epochNow - (14400*4))){
//                    System.out.println(d.getTitle() + "    timestamp: 16-20 hours");
//                }
//                if(timestamp <= (epochNow - (14400*6)) && timestamp >= (epochNow - (14400*7))){
//                    System.out.println(d.getTitle() + "    timestamp: 20-24 hours");
//                }
//                if(timestamp < (epochNow - (14400*7))){
//                    System.out.println(d.getTitle() + "    timestamp: 24 hours or more");
//                }
            }

        }
    }

    long removeLastNDigits(long x, long n) {
        return (long) (x / Math.pow(10, n));
    }



}
