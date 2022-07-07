package com.alvaro.study.outbound.ports;

import com.alvaro.study.outbound.entities.ProductEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface ProductOutputPort {

    public Flux<ProductEntity> findAll();
}
