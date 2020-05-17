package com.github.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    public String returnString(){
        return "hello world,learn svn + jenkins";
    }

    public static void main(String[] args) {

    }
}
