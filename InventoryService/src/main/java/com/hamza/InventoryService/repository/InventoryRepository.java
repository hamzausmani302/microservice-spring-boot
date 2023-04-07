package com.hamza.InventoryService.repository;

import com.hamza.InventoryService.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory , Integer> {
    public Inventory findOneBySkuCode(String skuCode);
}
