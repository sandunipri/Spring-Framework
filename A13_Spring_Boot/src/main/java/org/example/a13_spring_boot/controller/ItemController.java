package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.service.impl.ItemServiceImpl;
import org.example.a13_spring_boot.util.ResponseUtil;
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
    public ResponseUtil saveItem(@RequestBody ItemDTO itemDTO){
        boolean res = itemService.saveItem(itemDTO);
        if (res) {
            return new ResponseUtil(200, "Item saved successfull", null);
        }
        return new ResponseUtil(409,"Item not saved",null);

    }

    @GetMapping(path = "get")
    public ResponseUtil getItems(){
         return new ResponseUtil(200,"success",itemService.getItems());
    }


    @PutMapping(path = "update")
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
        boolean res =  itemService.updateItem(itemDTO);
        if (res){
            return new ResponseUtil(200,"Item Updated Successful",null);
        }
        return new ResponseUtil(404,"Item not Updated",null);
    }


    @DeleteMapping(path = "delete", params = {"code"})
    public ResponseUtil deleteItem(@RequestParam(value = "code") int code){
         return new ResponseUtil(200,"Item Deleted Successful",itemService.deleteItem(code));

    }

}
