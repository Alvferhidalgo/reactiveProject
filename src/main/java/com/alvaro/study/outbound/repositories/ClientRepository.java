package com.alvaro.study.outbound.repositories;

import com.alvaro.study.outbound.entities.ClientEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface ClientRepository extends ReactiveMongoRepository<ClientEntity, String> {
}
