package com.hamza.OrderService.controller;


import com.hamza.OrderService.DTO.PlaceOrderRequestDTO;
import com.hamza.OrderService.helpers.ResponseHandler;
import com.hamza.OrderService.models.Order;
import com.hamza.OrderService.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getAllOrders(){
        List<Order> orders = orderService.findAllOrders();
        return ResponseHandler.generateResponse(HttpStatus.OK , orders );
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody  PlaceOrderRequestDTO requestDTO){
        orderService.placeOrder(requestDTO);
    }





}
