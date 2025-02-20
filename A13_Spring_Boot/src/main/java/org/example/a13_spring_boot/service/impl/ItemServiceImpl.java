package org.example.a13_spring_boot.service.impl;

import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.repo.ItemRepo;
import org.example.a13_spring_boot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Boolean saveItem(ItemDTO itemDTO) {
      /*  Item item = new Item(
                itemDTO.getCode(),
                itemDTO.getName(),
                itemDTO.getQty(),
                itemDTO.getPrice()
        );*/

        if (!itemRepo.existsById(itemDTO.getCode())){
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
            return true;
        }
        return false;
    }

    @Override
    public List<ItemDTO> getItems() {
     /*   List<Item> items = itemRepo.findAll();
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
        return itemDTOs;*/
        return modelMapper.map(itemRepo.findAll(),new TypeToken<List<ItemDTO>>(){}.getType());
    }

    @Override
    public Boolean updateItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getCode())){
            itemRepo.save(modelMapper.map(itemDTO,Item.class));
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteItem(int code) {
        itemRepo.deleteById(code);
        return true;
    }
}
