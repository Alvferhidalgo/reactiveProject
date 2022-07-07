package com.alvaro.study.outbound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="PRODUCTS")
public class ProductEntity implements Serializable {

    @Id
    private String id;

    private String name;

    private String category;

    private Double price;

    private String description;
}
