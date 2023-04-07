package com.hamza.InventoryService.services;


import com.hamza.InventoryService.models.Inventory;
import com.hamza.InventoryService.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public int getQuantity(String skuCode){
        try {
            Inventory inventory = inventoryRepository.findOneBySkuCode(skuCode);
            return inventory == null ? 0 : inventory.quantity;
        }catch(Exception e){
            return 0;
        }
        }

    public  List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }
}
