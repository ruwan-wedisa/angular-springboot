package com.example.angularspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @RequestMapping("/")
//    public String greet() {
//        return "welcome";
//    }

    @RequestMapping("/home")
    public String home() {
        return "This is the home page";
    }

}
