package com.walker.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author walker
 * @date 2019/3/7
 */
@RestController
public class TestController {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
