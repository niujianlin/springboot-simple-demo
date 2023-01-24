package com.example.springboothello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


//    @RequestMapping (value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(String nickname) {
        System.out.println(nickname);
        return "你好 " + nickname;
    }
}
