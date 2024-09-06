package com.assignment.question;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video setQuality(Video video);

}