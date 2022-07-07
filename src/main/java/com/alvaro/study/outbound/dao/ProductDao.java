package com.alvaro.study.outbound.dao;

import com.alvaro.study.outbound.entities.ProductEntity;
import com.alvaro.study.outbound.ports.ProductOutputPort;
import com.alvaro.study.outbound.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;


@Component
@AllArgsConstructor
public class ProductDao implements ProductOutputPort {

    private final ProductRepository repository;


    @Override
    public Flux<ProductEntity> findAll(){
        return repository.findAll();
    }
}
