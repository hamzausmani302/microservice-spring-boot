package com.hamza.OrderService.service;


import com.hamza.OrderService.DTO.PlaceOrderRequestDTO;
import com.hamza.OrderService.DTO.Status;
import com.hamza.OrderService.models.Order;
import com.hamza.OrderService.models.OrderItem;
import com.hamza.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService  {
    @Autowired
    private OrderRepository orderRepository;

    public void placeOrder(PlaceOrderRequestDTO orderRequest){
        List<OrderItem> orderItems = orderRequest.getOrderedItems().stream().map(order -> OrderItem.builder()
                .price(order.price)
                .name(order.name)
                .description(order.description)
                .quantity(order.quantity).build()
                ).toList();
        Order _order = Order.builder()
                .status(Status.PENDING)
                .orderedItems(orderItems).build();
        orderRepository.save(_order);

    }

    public List<Order> findAllOrders(){
        return orderRepository.findByOrderByOrderNoDesc();
    }



}
