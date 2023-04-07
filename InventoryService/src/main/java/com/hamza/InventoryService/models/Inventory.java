package com.hamza.InventoryService.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "inventory_t")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Inventory {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    @Column(unique = true)
    public String skuCode;
    public int quantity;
}


