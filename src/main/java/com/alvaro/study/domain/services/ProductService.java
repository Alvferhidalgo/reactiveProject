package com.alvaro.study.domain.services;

import com.alvaro.study.commons.mappers.ProductMapper;
import com.alvaro.study.domain.vos.Product;
import com.alvaro.study.inbound.ports.ProductInputPort;
import com.alvaro.study.outbound.ports.ProductOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class ProductService implements ProductInputPort {

    private final ProductMapper mapper;
    private final ProductOutputPort productOutputPort;


    @Override
    public Flux<Product> findAll() {
        return productOutputPort.findAll().map(mapper::entityToVos);
    }
}
