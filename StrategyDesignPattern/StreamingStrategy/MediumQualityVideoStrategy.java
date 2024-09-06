package com.assignment.question;

public class MediumQualityVideoStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType(){
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }

}