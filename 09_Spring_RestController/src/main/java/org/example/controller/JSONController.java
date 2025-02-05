package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping
    public String test01(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }

/*    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test02(){
        return new CustomerDTO("Sanudni","priyadarshani",25);
    }

    @GetMapping(path = "data",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test03(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("Sanudni","priyadarshani",25));
        customerDTOS.add(new CustomerDTO("Sanudni","priyadarshani",25));
        customerDTOS.add(new CustomerDTO("Sanudni","priyadarshani",25));
        return customerDTOS;
    }*/

}
