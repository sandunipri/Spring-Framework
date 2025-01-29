package org.example.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")

public class HelloController {
    public HelloController() {
        System.out.println("HelloController Instantiated");
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
