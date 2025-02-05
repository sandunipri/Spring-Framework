package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
  /*  @PostMapping
    public String test01
            (@RequestParam(value = "id") String id,
             @RequestParam(value = "name") String name
            ){
        return id + " " + name;
    }*/

    @PostMapping
    public String test01(@ModelAttribute CustomerDTO customerDTO){
        System.out.println(customerDTO);
        return customerDTO.toString();
    }


}
