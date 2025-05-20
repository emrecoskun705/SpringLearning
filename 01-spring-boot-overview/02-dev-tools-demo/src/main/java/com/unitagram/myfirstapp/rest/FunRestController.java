package com.unitagram.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
