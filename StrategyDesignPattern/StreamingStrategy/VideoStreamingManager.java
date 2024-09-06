package com.assignment.question;

public class VideoStreamingManager {

    private Video video;
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;

    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        qualityAdjustmentStrategy = QualityAdjustmentStrategyFactory.getStrategy(video.getVideoQuality());
        return qualityAdjustmentStrategy.setQuality(video);
    }
}