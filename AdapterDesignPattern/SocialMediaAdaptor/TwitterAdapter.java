package com.assignment.question;

import java.util.*;
import com.assignment.question.SocialMediaPost;
import com.assignment.question.external.TwitterApi;
import com.assignment.question.external.TwitterTweet;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterApi twitterApi = new TwitterApi();
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        List<TwitterTweet> posts = twitterApi.getTweets(userId);
        return convertToSocialMediaPost(posts);
    }

    public void postMessages(Long user, String message) {
        twitterApi.tweet(user, message);
    }

    private List<SocialMediaPost> convertToSocialMediaPost(List<TwitterTweet> posts) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (TwitterTweet post : posts) {
            SocialMediaPost tweetpost = new SocialMediaPost(post.getId(), post.getUserId(), post.getTweet(), System.currentTimeMillis());
            socialMediaPosts.add(tweetpost);
        }
        return socialMediaPosts;
    }
}