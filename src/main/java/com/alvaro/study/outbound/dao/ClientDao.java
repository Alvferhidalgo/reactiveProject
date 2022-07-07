package com.alvaro.study.outbound.dao;

import com.alvaro.study.outbound.entities.ClientEntity;
import com.alvaro.study.outbound.ports.ClientOutputPort;
import com.alvaro.study.outbound.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@AllArgsConstructor
public class ClientDao implements ClientOutputPort {

    private final ClientRepository repository;

    @Override
    public Flux<ClientEntity> findAll(Long pageSkipe, Long pageTake) {
        return repository.findAll().skip(pageSkipe).take(pageTake);
    }

    //skip(n) se salta los primeros n elementos
    //take(n) coge n cantidad de elementos
    @Override
    public void addClient(ClientEntity entity) {
        Flux.just(entity)
                .flatMap(repository::save)
                .subscribe(client -> log.info("Insert: " + client.getName()));
    }

}
