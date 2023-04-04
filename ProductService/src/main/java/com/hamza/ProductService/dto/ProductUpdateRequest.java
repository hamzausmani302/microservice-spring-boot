package com.hamza.ProductService.dto;

import com.mongodb.lang.Nullable;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class ProductUpdateRequest {


    public String Name;

    public int price;

    public String description;

}
