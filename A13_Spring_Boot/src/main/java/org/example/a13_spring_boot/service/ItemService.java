package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public Boolean saveItem(ItemDTO itemDTO) {
        Item item = new Item(
                itemDTO.getCode(),
                itemDTO.getName(),
                itemDTO.getQty(),
                itemDTO.getPrice()
        );
        itemRepo.save(item);
        return true;
    }

    public List<ItemDTO> getItems() {
        List<Item> items = itemRepo.findAll();
        List<ItemDTO> itemDTOs = new ArrayList<>();
        for (Item item : items){
            itemDTOs.add(
                    new ItemDTO(
                            item.getCode(),
                            item.getName(),
                            item.getQty(),
                            item.getPrice()
                    )
            );
        }
        return itemDTOs;
    }


    public Boolean updateItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getCode())){
            Item item = new Item(
                    itemDTO.getCode(),
                    itemDTO.getName(),
                    itemDTO.getQty(),
                    itemDTO.getPrice()
            );
            itemRepo.save(item);
            return true;
        }
        return false;
    }

    public Boolean deleteItem(int code) {
        itemRepo.deleteById(code);
        return true;
    }
}
