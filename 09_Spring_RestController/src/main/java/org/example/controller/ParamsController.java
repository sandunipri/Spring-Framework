package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {
   // http://localhost:8080/params?id=123&name=abc
    @GetMapping(params = {"id","name"})
    public String test01(
            @RequestParam(value = "id",required = false) String id ,
            @RequestParam (value = "name",required = false) String name
    ) {
        return id + " " + name;
    }

}
