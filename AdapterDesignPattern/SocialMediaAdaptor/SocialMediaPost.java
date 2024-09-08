package com.assignment.question;

public class SocialMediaPost {

    private String id;
    private Long userId;
    private String message;
    private Long timestamp;

    public SocialMediaPost(String id, Long userId, String message, Long timestamp) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.timestamp = timestamp;
    }
}