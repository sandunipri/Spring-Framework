package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(path = "save")
    public Boolean saveItem(@RequestBody ItemDTO itemDTO){
        return itemService.saveItem(itemDTO);
    }

    @GetMapping(path = "get")
    public List<ItemDTO> getItems(){
        return itemService.getItems();
    }
    @PutMapping(path = "update")
    public Boolean updateItem(@RequestBody ItemDTO itemDTO){
        return itemService.updateItem(itemDTO);
    }

    @DeleteMapping(path = "delete", params = {"code"})
    public Boolean deleteItem(@RequestParam(value = "code") int code){
        return itemService.deleteItem(code);
    }

}
