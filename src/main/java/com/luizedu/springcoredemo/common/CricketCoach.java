package com.luizedu.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @PostConstruct
    public void starting() {
        System.out.println("Starting..." + getClass().getSimpleName());
    }

    @PreDestroy
    public void destroying() {
        System.out.println("Finishing..." + getClass().getSimpleName());
    }

}
