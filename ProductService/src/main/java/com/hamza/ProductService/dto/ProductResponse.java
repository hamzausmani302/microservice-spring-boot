package com.hamza.ProductService.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {
    public String id;
    public String Name;
    public int price;
    public String description;
}
