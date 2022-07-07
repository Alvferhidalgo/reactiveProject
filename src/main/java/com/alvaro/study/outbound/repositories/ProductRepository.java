package com.alvaro.study.outbound.repositories;

import com.alvaro.study.outbound.entities.ProductEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<ProductEntity, String> {
}
