package me.caleb.tasks;

import me.caleb.data.Datum;
import me.caleb.App;

//just printing out message on timer of what we have so far
//need to add logic to differentiate our valued posts
public class PostCollectionChecker extends Thread {
    public void run() {

        System.out.println("Number of unique posts I'm tracking :: " + App.getPostList().size());
        for(Datum post: App.getPostList()){
            System.out.println(post.getTitle());
        }

    }
}

// if (postText != null && !postText.equalsIgnoreCase("[removed]") && postText.length() > 10)


//need to fire an event when there is a change to our current list
//now we are just poling size but we need to only fire event when collection changes