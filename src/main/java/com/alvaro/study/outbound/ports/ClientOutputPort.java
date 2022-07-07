package com.alvaro.study.outbound.ports;

import com.alvaro.study.outbound.entities.ClientEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface ClientOutputPort {

    public Flux<ClientEntity> findAll(Long pageSkipe, Long pageTake);

    public void addClient(ClientEntity entity);
}
