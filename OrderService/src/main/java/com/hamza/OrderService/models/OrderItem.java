package com.hamza.OrderService.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;


@Entity
@Table(name= "OrderItems")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;
    @Column(name="name")
    public String name;
    @Column(name="price")
    public int price;
    @Column(name= "description")
    public String description;
    @Column(name = "quantity")
    public int quantity;
    public Order order;
}

