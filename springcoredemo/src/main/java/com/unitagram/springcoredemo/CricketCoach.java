package com.unitagram.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice push ups for 30 mins!!";
    }
}
