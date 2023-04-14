package com.example.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funClass {

    @GetMapping("/")
    public String pozdrav() {
        return "Ahoj, jak se máš?!";
    }

    @GetMapping("/druhyPozdrav")
    public String pozdrav2() {
        return "Ahoj, jak se máš?! Pořád dobře??";
    }

    @Value("${coach.name}")
    private String coachname;

    @GetMapping("/info")
    public String getInfo(){
        return "Coach name: " + coachname;
    }


}
