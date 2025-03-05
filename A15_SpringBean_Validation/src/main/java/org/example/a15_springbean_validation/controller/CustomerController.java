package org.example.a15_springbean_validation.controller;

import jakarta.validation.Valid;
import org.example.a15_springbean_validation.dto.CustomerDTO;
import org.example.a15_springbean_validation.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping(path = "/save")
    public ResponseEntity<ResponseDTO> createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        ResponseDTO responseDTO = new ResponseDTO(
                "user created succseeefully",
                HttpStatus.CREATED.value(),
                customerDTO
        );
        return new ResponseEntity(responseDTO, HttpStatus.CREATED);
    }
}
