package com.alvaro.study.inbound.rest.controllers;

import com.alvaro.study.commons.EndpointConstants;
import com.alvaro.study.commons.dto.ClientDto;
import com.alvaro.study.commons.mappers.ClientMapper;
import com.alvaro.study.inbound.ports.ClientInputPort;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@RestController
public class ClientController {

    private final ClientMapper mapper;
    private final ClientInputPort clientInputPort;


    @GetMapping(EndpointConstants.CLIENTS_FINDALL)
    public Flux<ClientDto> findAllClients(@PathVariable Long page) {
        return clientInputPort.findAll(selectPage(page), EndpointConstants.PAGE_TAKE).map(mapper::vosToDto);
    }

    private Long selectPage(Long page) {
        page = (page == 0) ? 1 : page;
        Long pageSkip = (page - 1) * 5;
        return pageSkip;
    }

}
