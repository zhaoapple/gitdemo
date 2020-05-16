package com.github.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    public String returnString(){
        return "hello world  123";
    }
}
