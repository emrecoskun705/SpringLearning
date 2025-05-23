package com.unitagram.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }


    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }


    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "go fitness every day";
    }

    @GetMapping("/drink")
    public String getDailyDrink() {
        return "water always";
    }
}
