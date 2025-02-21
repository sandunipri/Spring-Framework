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
    public void saveItem(ItemDTO itemDTO) {
      /*  Item item = new Item(
                itemDTO.getCode(),
                itemDTO.getName(),
                itemDTO.getQty(),
                itemDTO.getPrice()
        );*/

        if (!itemRepo.existsById(itemDTO.getCode())){
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
        }
       throw new RuntimeException("Item already exist");
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
    public void updateItem(ItemDTO itemDTO) {
        if (!itemRepo.existsById(itemDTO.getCode())){
            throw new RuntimeException("Item does not Exists");
        }
        itemRepo.save(modelMapper.map(itemDTO,Item.class));
    }

    @Override
    public void deleteItem(int code) {

        if (itemRepo.existsById(code)){
            itemRepo.deleteById(code);
        }
        throw new RuntimeException("Item does not Exists");
    }
}
