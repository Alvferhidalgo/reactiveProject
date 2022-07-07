package com.alvaro.study.outbound.entities;

import com.alvaro.study.domain.vos.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="CLIENTS")
public class ClientEntity implements Serializable {

    @Id
    private String id;

    private String name;

    private String surname;

    private String secondSurname;

    private Integer age;

    private Boolean vip;

    private List<Product> historical;

    private List<Product> cart;
}
