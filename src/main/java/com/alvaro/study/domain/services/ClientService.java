package com.alvaro.study.domain.services;

import com.alvaro.study.commons.mappers.ClientMapper;
import com.alvaro.study.domain.vos.Client;
import com.alvaro.study.inbound.ports.ClientInputPort;
import com.alvaro.study.outbound.entities.ClientEntity;
import com.alvaro.study.outbound.ports.ClientOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientService implements ClientInputPort {

    private final ClientOutputPort clientOutputPort;
    private final ClientMapper mapper;

    @Override
    public Flux<Client> findAll(Long pageSkipe, Long pageTake) {
        return clientOutputPort.findAll(pageSkipe,pageTake).map(mapper::entityToVos);
    }
}
