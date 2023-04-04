package com.hamza.ProductService.repository;

import com.hamza.ProductService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;


public interface ProductRepository extends MongoRepository<Product , String> {

//    public List<Product> findAndSort(Pageable pageable);
        public List<Product> findByName(String Name);

        @Override
        Optional<Product> findById(String s);

        public List<Product> findByNameContainingOrDescriptionContaining(String Name, String Description);
}
