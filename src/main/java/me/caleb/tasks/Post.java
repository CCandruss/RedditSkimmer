package me.caleb.tasks;

public class Post {
    String postTitle;
    String postContent;
    String postId;
    int postAwards;
    int postComments;

    public Post( String title, String content, String id, int awards, int comments){
        postTitle = title;
        postContent = content;
        postAwards = awards;
        postComments = comments;
        postId = id;
    }

    public String getPostTitle(){
        return postTitle;
    };

    public String getPostContent(){
        return postContent;
    };

    public int getPostAwards(){
        return postAwards;
    };

    public int getPostComments(){
        return postComments;
    };
}
