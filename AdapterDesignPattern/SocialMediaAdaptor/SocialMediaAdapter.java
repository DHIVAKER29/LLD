package com.assignment.question;

import java.util.*;
import com.assignment.question.SocialMediaPost;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPosts(Long user, Long timestamp);
    void postMessages(Long user, String message);
}