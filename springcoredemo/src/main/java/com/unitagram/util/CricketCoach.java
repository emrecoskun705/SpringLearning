package com.unitagram.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice push ups for 30 mins!!";
    }
}
