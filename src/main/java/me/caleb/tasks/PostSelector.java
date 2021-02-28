package me.caleb.tasks;

import me.caleb.data.Datum;
import me.caleb.hi;

public class PostSelector {
    String postTitle;
    String postText;
    String id ;
    int totalAwardsReceived;
    int numComments;

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



}
