package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {
    @GetMapping(path = "test1")
    public String exactMapping(){
        return "Get Mapping Invoked";
    }
    @GetMapping(path = "test2")
    public String exactMapping2(){
        return "Get Mapping Invoked";
    }
    @GetMapping(path = "test3/example/123")
    public String exactMappings(){
        return "Get Mapping Invoked 123";
    }

}
