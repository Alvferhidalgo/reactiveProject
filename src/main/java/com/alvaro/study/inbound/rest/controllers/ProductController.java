package com.alvaro.study.inbound.rest.controllers;

import com.alvaro.study.commons.EndpointConstants;
import com.alvaro.study.commons.dto.ProductDto;
import com.alvaro.study.commons.mappers.ProductMapper;
import com.alvaro.study.inbound.ports.ProductInputPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductInputPort productInputPort;
    private final ProductMapper mapper;

    @GetMapping(EndpointConstants.PRODUCTS_FINDALL)
    public Flux<ProductDto> findAllProducts(){
        return productInputPort.findAll().map(mapper::vosToDto);
    }
}
