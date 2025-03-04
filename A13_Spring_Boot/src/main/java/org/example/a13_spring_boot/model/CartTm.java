package org.example.a13_spring_boot.model;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.dto.ItemDTO;

import java.util.List;

public class CartTm {
    private CustomerDTO customerDTO;
    private List<ItemDTO> itemDTOS;

    public CartTm() {
    }

    public CartTm(CustomerDTO customerDTO, List<ItemDTO> itemDTOS) {
        this.customerDTO = customerDTO;
        this.itemDTOS = itemDTOS;
    }

    public List<ItemDTO> getItemDTOS() {
        return itemDTOS;
    }

    public void setItemDTOS(List<ItemDTO> itemDTOS) {
        this.itemDTOS = itemDTOS;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "CartTm{" +
                "customerDTO=" + customerDTO +
                ", itemDTOS=" + itemDTOS +
                '}';
    }
}
