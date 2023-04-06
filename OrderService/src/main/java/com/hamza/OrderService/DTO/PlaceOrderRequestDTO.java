package com.hamza.OrderService.DTO;


import com.hamza.OrderService.models.OrderItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlaceOrderRequestDTO {


    public List<OrderItem> orderedItems;

}
