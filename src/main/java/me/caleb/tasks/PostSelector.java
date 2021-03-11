package me.caleb.tasks;

import com.google.gson.Gson;
import me.caleb.App;
import me.caleb.data.Datum;
import me.caleb.data.averages.AwardsReceived;
import me.caleb.data.averages.LikeRatios;
import me.caleb.data.averages.NumComments;
import me.caleb.data.averages.NumCrossposts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class PostSelector {
    String postTitle;
    String postText;
    String id ;
    int totalAwardsReceived;
    int numComments;
    Double upVoteRatio;
    long retrievedOn;
    Long timestamp;
    int numCrossposts;
    Double likeRatio;
    InfoGrab iG = new InfoGrab();
//
//    ArrayList<AwardsReceived> awardList4 = new ArrayList<AwardsReceived>();
//    ArrayList<AwardsReceived> awardList8 = new ArrayList<AwardsReceived>();
//    ArrayList<AwardsReceived> awardList12 = new ArrayList<AwardsReceived>();
//    ArrayList<AwardsReceived> awardList24 = new ArrayList<AwardsReceived>();
//    ArrayList<NumComments> numComments4 = new ArrayList<NumComments>();
//    ArrayList<NumComments> numComments8 = new ArrayList<NumComments>();
//    ArrayList<NumComments> numComments12 = new ArrayList<NumComments>();
//    ArrayList<NumComments> numComments24 = new ArrayList<NumComments>();
//    ArrayList<NumCrossposts> numCrossposts4 = new ArrayList<NumCrossposts>();
//    ArrayList<NumCrossposts> numCrossposts8 = new ArrayList<NumCrossposts>();
//    ArrayList<NumCrossposts> numCrossposts12 = new ArrayList<NumCrossposts>();
//    ArrayList<NumCrossposts> numCrossposts24 = new ArrayList<NumCrossposts>();
//    ArrayList<LikeRatios> likeRatios4 = new ArrayList<LikeRatios>();
//    ArrayList<LikeRatios> likeRatios8 = new ArrayList<LikeRatios>();
//    ArrayList<LikeRatios> likeRatios12 = new ArrayList<LikeRatios>();
//    ArrayList<LikeRatios> likeRatios24 = new ArrayList<LikeRatios>();

    public Boolean checkPost(Datum post){
        postTitle = post.getTitle();
        postText = post.getSelftext();

        if(postText != null && !postText.equalsIgnoreCase("[removed]")&& !postText.equalsIgnoreCase("[deleted]") && postText.length() > 100){
            return true;
        } else {
            return false;
        }
    }

    public void filterForRelevance(){

        for (Datum d : App.getPostList()) {
//            postTitle = d.getTitle();
//            postText = d.getSelftext();
            id = d.getId();
//            totalAwardsReceived = d.getTotalAwardsReceived();
//            numComments = d.getNumComments();
//            upVoteRatio = d.getUpvoteRatio();
//            retrievedOn = d.getRetrievedOn();
//            numCrossposts=d.getNumCrossposts();
//            likeRatio = d.getUpvoteRatio();

            if(d.getPostTime() != 0){
                timestamp = d.getPostTime();
                long epochNow = System.currentTimeMillis();
                long timeGap = (epochNow - timestamp);

                if(timeGap < 1340000){
                    iG.getUpdate(d.getId());
                } System.out.println(d.getTitle());
                //I am making time gap here 5 seconds, I will have on 4 second timer to try to hit everyones 4 hour mark and collect average over time
//                if(timeGap < 14400000 && timeGap > 14395000 ) {
//                    //add function for new http by id in InfoGrab class
//                    AwardsReceived aR = new AwardsReceived(totalAwardsReceived,id);
//                    awardList4.add(aR);
//                    NumComments nC = new NumComments(numComments,id);
//                    numComments4.add(nC);
//                    NumCrossposts nCr = new NumCrossposts(numCrossposts,id);
//                    numCrossposts4.add(nCr);
//                    LikeRatios lR = new LikeRatios(likeRatio,id);
//                    likeRatios4.add(lR);
//                    try {
//                        Files.writeString(Path.of("data/award_list.json"), new Gson().toJson(awardList4));
//                        Files.writeString(Path.of("data/like_ratio4.json"), new Gson().toJson(numComments4));
//                        Files.writeString(Path.of("data/num_comments4.json"), new Gson().toJson(numCrossposts4));
//                        Files.writeString(Path.of("data/num_crossposts4.json"), new Gson().toJson(likeRatios4));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(postTitle + "4 hour update");
//                }
//                if(timeGap < 28800000 && timeGap > 28795000 ) {
//                    AwardsReceived aR = new AwardsReceived(totalAwardsReceived,id);
//                    awardList8.add(aR);
//                    NumComments nC = new NumComments(numComments,id);
//                    numComments8.add(nC);
//                    NumCrossposts nCr = new NumCrossposts(numCrossposts,id);
//                    numCrossposts8.add(nCr);
//                    LikeRatios lR = new LikeRatios(likeRatio,id);
//                    likeRatios8.add(lR);
//                    try {
//                        Files.writeString(Path.of("data/award_list8.json"), new Gson().toJson(awardList8));
//                        Files.writeString(Path.of("data/like_ratio8.json"), new Gson().toJson(numComments8));
//                        Files.writeString(Path.of("data/num_comments8.json"), new Gson().toJson(numCrossposts8));
//                        Files.writeString(Path.of("data/num_crossposts8.json"), new Gson().toJson(likeRatios8));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(postTitle + "8 hour update");
//                }
//                if(timeGap < 43200000 && timeGap > 43195000 ) {
//                    AwardsReceived aR = new AwardsReceived(totalAwardsReceived,id);
//                    awardList12.add(aR);
//                    NumComments nC = new NumComments(numComments,id);
//                    numComments12.add(nC);
//                    NumCrossposts nCr = new NumCrossposts(numCrossposts,id);
//                    numCrossposts12.add(nCr);
//                    LikeRatios lR = new LikeRatios(likeRatio,id);
//                    likeRatios12.add(lR);
//                    try {
//                        Files.writeString(Path.of("data/award_list12.json"), new Gson().toJson(awardList12));
//                        Files.writeString(Path.of("data/like_ratio12.json"), new Gson().toJson(numComments12));
//                        Files.writeString(Path.of("data/num_comments12.json"), new Gson().toJson(numCrossposts12));
//                        Files.writeString(Path.of("data/num_crossposts12.json"), new Gson().toJson(likeRatios12));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(postTitle + "12 hour update");
//                }
//                if(timeGap < 86400000 && timeGap > 86395000 ) {
//                    AwardsReceived aR = new AwardsReceived(totalAwardsReceived,id);
//                    awardList24.add(aR);
//                    NumComments nC = new NumComments(numComments,id);
//                    numComments24.add(nC);
//                    NumCrossposts nCr = new NumCrossposts(numCrossposts,id);
//                    numCrossposts24.add(nCr);
//                    LikeRatios lR = new LikeRatios(likeRatio,id);
//                    likeRatios24.add(lR);
//                    try {
//                        Files.writeString(Path.of("data/award_list24.json"), new Gson().toJson(awardList24));
//                        Files.writeString(Path.of("data/like_ratio24.json"), new Gson().toJson(numComments24));
//                        Files.writeString(Path.of("data/num_comments24.json"), new Gson().toJson(numCrossposts24));
//                        Files.writeString(Path.of("data/num_crossposts24.json"), new Gson().toJson(likeRatios24));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(postTitle + "24 hour update");
//                }
            }
//            else {
//                App.getPostList().remove(d);
//                continue;
//            }
        }
    }
}
