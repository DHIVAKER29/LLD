package com.assignment.question;

import java.util.*;
import com.assignment.question.SocialMediaPost;
import com.assignment.question.external.FacebookApi;
import com.assignment.question.external.FacebookPost;

public class FacebookAdapter implements SocialMediaAdapter {
    private FacebookApi facebookApi = new FacebookApi();
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        return convertToSocialMediaPost(posts);
    }

    public void postMessages(Long user, String message) {
        facebookApi.postFacebookStatus(user, message);
    }

    private List<SocialMediaPost> convertToSocialMediaPost(List<FacebookPost> posts) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (FacebookPost post : posts) {
            SocialMediaPost fbpost = new SocialMediaPost(post.getId(), post.getUserId(), post.getStatus(), post.getTimestamp());
            socialMediaPosts.add(fbpost);
        }
        return socialMediaPosts;
    }
}