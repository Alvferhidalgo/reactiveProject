package com.alvaro.study.inbound.ports;

import com.alvaro.study.domain.vos.Product;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface ProductInputPort {

    public Flux<Product> findAll();
}
