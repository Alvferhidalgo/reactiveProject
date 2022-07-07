package com.alvaro.study.domain.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private String id;

    private String name;

    private String surname;

    private String secondSurname;

    private Integer age;

    private Boolean vip;

    private List<Product> historical;

    private List<Product> cart;
}
