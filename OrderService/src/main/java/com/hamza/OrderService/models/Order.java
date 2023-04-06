package com.hamza.OrderService.models;


import com.hamza.OrderService.DTO.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name= "Order_t")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long orderNo;
    @OneToMany( cascade = CascadeType.ALL)
    public List<OrderItem> orderedItems;
    @Enumerated(EnumType.ORDINAL)
    public Status status = Status.PENDING;

}
