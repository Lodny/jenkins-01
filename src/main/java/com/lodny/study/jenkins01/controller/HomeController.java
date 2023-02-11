package com.lodny.study.jenkins01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello() : ");
        return "hello";
    }
}
