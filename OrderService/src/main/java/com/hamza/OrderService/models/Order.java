package com.hamza.OrderService.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name= "Order")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID orderNo;


    @OneToMany(targetEntity = OrderItem.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "order_item_fk" , referencedColumnName = "id")
    public List<OrderItem> orderedItems;


}
