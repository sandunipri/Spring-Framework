package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
    public HomeController() {
        System.out.println("HomeController Instantiated");
    }
    @GetMapping
    public String home(){
        return "home";
    }

}
