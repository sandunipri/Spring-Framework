package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.entity.Item;
import org.modelmapper.TypeToken;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);

    List<ItemDTO> getItems();

    void updateItem(ItemDTO itemDTO);

    void deleteItem(int code);
}
