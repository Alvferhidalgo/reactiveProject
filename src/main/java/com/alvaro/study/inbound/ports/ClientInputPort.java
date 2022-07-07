package com.alvaro.study.inbound.ports;

import com.alvaro.study.domain.vos.Client;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public interface ClientInputPort {

    public Flux<Client> findAll(Long pageSkipe, Long pageTake);
}
