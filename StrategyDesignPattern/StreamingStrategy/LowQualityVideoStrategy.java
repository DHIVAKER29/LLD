package com.assignment.question;

public class LowQualityVideoStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType(){
        return VideoQuality.LOW;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }

}