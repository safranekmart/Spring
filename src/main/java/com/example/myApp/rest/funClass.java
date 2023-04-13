package com.example.myApp.rest;

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


}
