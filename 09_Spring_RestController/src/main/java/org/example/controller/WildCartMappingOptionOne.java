package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCartMappingOptionOne {
    // http://localhost:8080/09_Spring_RestController_war_exploded/one/test/can give any name/hello
    @GetMapping(path = "test/*/hello")
    public String test(){
        return "Get Mapping Option One Invoked";
    }
    @GetMapping(path = "test/*/*")
    public String test2(){
        return "Get Mapping Option two Invoked";
    }
}
