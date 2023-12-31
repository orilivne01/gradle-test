package com.example.gradletest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradle")
public class Controller {
    @RequestMapping("/test")
    public String test(){
        return "test1";
    }
}
