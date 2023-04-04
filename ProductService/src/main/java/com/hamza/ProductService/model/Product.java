package com.hamza.ProductService.model;


import com.mongodb.lang.Nullable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document("Product")
@NoArgsConstructor  //create an empoty constructor
@AllArgsConstructor //creates a constructor of all arguments
@Builder        //set buiklder on it
@Data       //bunldes the feature of toString() , Equals , @Getter , @Setter
public class Product {
    @Id
    public String id;
    public String name;
    public int price;




    public String description;
}
