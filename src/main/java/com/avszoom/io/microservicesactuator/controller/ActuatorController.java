package com.avszoom.io.microservicesactuator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

    @GetMapping("/")
    public String start(){
        return "<h1>Actuator Starting in a min....</h1>";
    }

}
