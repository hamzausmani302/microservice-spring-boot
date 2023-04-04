package com.hamza.ProductService.controller;


import com.hamza.ProductService.dto.ProductRequest;
import com.hamza.ProductService.dto.ProductResponse;
import com.hamza.ProductService.dto.ProductUpdateRequest;
import com.hamza.ProductService.helpers.ResponseHandler;
import com.hamza.ProductService.service.ProductService;
import com.mongodb.lang.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController{
    private final ProductService productService;




    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> get(){

        return ResponseHandler.generateResponse(HttpStatus.OK , productService.getProducts());
    }
    @GetMapping("/query")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getByName(@RequestParam(name="keyword") String Name ){
        return ResponseHandler.generateResponse(HttpStatus.OK , productService.getProductById(Name));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void post( @RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }





    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestParam(name = "id") String id ,@RequestBody ProductUpdateRequest productRequest){
        productService.updateProduct(id , productRequest);
//        System.out.println("test"+param);
    }


}
