package com.hamza.OrderService.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlaceOrderItemRequest {
    public String name;
    public int price;
    public String description;
    public int quantity;
}
