package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "helooooooooooo";
    }
    @PostMapping
    public String post(){
        return "Post method";
    }
    @PutMapping
    public String put(){
        return "Put method";
    }
    @DeleteMapping
    public String delete(){
        return "Delete method";
    }
    @PatchMapping
    public String patch(){
        return "Patch method";
    }
}
