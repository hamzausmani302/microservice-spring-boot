package com.hamza.InventoryService.controllers;


import com.hamza.InventoryService.services.InventoryService;
import com.hamza.InventoryService.utils.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("instock/{item}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> isInStock(@PathVariable String item){
        System.out.println(item);
        System.out.println(inventoryService.getQuantity(item));
        if(inventoryService.getQuantity(item) > 0){
            return ResponseHandler.generateResponse(HttpStatus.OK , true);
        }
        return ResponseHandler.generateResponse(HttpStatus.OK , false);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getAllInfo(){
        return ResponseHandler.generateResponse(HttpStatus.OK , inventoryService.getInventory() );
    }
}
