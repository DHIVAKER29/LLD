package com.assignment.question;

public class HighQualityVideoStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType(){
        return VideoQuality.HIGH;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }

}
