package com.hamza.ProductService.service;

import com.hamza.ProductService.dto.ProductRequest;
import com.hamza.ProductService.dto.ProductResponse;
import com.hamza.ProductService.dto.ProductUpdateRequest;
import com.hamza.ProductService.model.Product;
import com.hamza.ProductService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;



    public void createProduct(ProductRequest productRequest){

        Product product = Product.builder()
                    .name(productRequest.Name)
                    .price(productRequest.price)
                    .description(productRequest.description)
                    .build();
        productRepository.save(product);


    }


    public List<ProductResponse> getProducts(){
        return productRepository.findAll().stream().map(product -> new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription()
                )
        ).toList();
    }
    public List<ProductResponse> getProductByName(String name){
        return productRepository.findByName(name).stream().map(product -> new ProductResponse(product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription())).toList();

    }
    public List<ProductResponse> getProductById(String keyword){
        return productRepository.findByNameContainingOrDescriptionContaining(keyword , keyword).stream().map(product -> new ProductResponse(product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription())).toList();

    }

    public void updateProduct(String id , ProductUpdateRequest updatedProduct) {
        productRepository.save(new Product(id , updatedProduct.Name , updatedProduct.price , updatedProduct.description));
    }
}
