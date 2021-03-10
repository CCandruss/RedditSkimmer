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
    Long timestamp;


    public Boolean checkPost(Datum post){
        postTitle = post.getTitle();
        postText = post.getSelftext();
        id = post.getId();
        totalAwardsReceived = post.getTotalAwardsReceived();
        numComments = post.getNumComments();

        if(postText != null && !postText.equalsIgnoreCase("[removed]")&& !postText.equalsIgnoreCase("[deleted]") && postText.length() > 100){
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
                long timeGap = (epochNow - timestamp);
                if(timeGap < 987879) {
                    System.out.println(postTitle +epochNow + "  " + timestamp + "   " + timeGap);
                }
//                System.out.println(postTitle + "    " + timeGap);
//                if(timeGap < 14400){
//                    System.out.println("just a wee babe");
//                }
//                if(timeGap < 28800 && timeGap > 14400){
//                    System.out.println(d.getTitle() + "    timestamp: 4-8hours");
//                }
//                if(timeGap < 43200 && timeGap >28800){
//                    System.out.println(d.getTitle() + "    timestamp: 8-12" );
//                }
//                if(timeGap < 57600 && timeGap >43200){
//                    System.out.println(d.getTitle() + "    timestamp: 12-16" );
//                }
//                if(timeGap < 72000 && timeGap >57600){
//                    System.out.println(d.getTitle() + "    timestamp: 16-20" );
//                }
//                if(timeGap < 86400 && timeGap >72000){
//                    System.out.println(d.getTitle() + "    timestamp: 20-24" );
//                }
            }

        }
    }

    long removeLastNDigits(long x, long n) {
        return (long) (x / Math.pow(10, n));
    }



}
