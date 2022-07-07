package com.alvaro.study;

import com.alvaro.study.outbound.entities.ClientEntity;
import com.alvaro.study.outbound.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class StudyApplication implements CommandLineRunner {

    @Autowired
    private final ClientRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        Flux.just(
                        new ClientEntity(null,"pepe","perez","lopez",12,false,null,null),
                        new ClientEntity(null,"paco","perez","lopez",12,false,null,null),
                        new ClientEntity(null,"bruce","perez","lopez",12,false,null,null),
                        new ClientEntity(null,"arnoldo","perez","lopez",12,false,null,null),
                        new ClientEntity(null,"bolondongo","perez","lopez",12,false,null,null)
                )
                .flatMap(client -> repository.save(client))
                .subscribe(client -> log.info("Insert: "+client.getName()));

         */
    }
}
