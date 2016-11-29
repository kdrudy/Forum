package com.theironyard;

/**
 * Created by kdrudy on 11/28/16.
 */
public class Post {
    String author;
    String text;
    int replyId;

    public Post(String author, String text, int replyId) {
        this.author = author;
        this.text = text;
        this.replyId = replyId;
    }
}
