package com.example.controller;

import com.example.domain.Greet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by laileon on 2017/4/30.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public Greet sayHello() {
        return new Greet("Hello World!");
    }
}
