package com.gayan.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class AppController {

    @GetMapping
    public String welcome(){
        return "Welcome jenkins : 8080";
    }
}
