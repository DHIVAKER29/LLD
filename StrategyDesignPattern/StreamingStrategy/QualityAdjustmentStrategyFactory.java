package com.assignment.question;

public class QualityAdjustmentStrategyFactory{

    public static  QualityAdjustmentStrategy getStrategy(VideoQuality videoQuality){
        return switch (videoQuality) {
            case LOW -> new LowQualityVideoStrategy();
            case MEDIUM -> new MediumQualityVideoStrategy();
            case HIGH -> new HighQualityVideoStrategy();
        };
    }
}