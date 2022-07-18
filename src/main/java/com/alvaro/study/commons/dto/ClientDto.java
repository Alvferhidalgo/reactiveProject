package com.alvaro.study.commons.dto;

import com.alvaro.study.domain.vos.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String id;

    private String name;

    private String surname;

    private String secondSurname;

    private Integer age;

    private Boolean vip;

    private List<ProductDto> historical;

    private List<ProductDto> cart;
}
