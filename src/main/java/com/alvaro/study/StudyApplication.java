package com.alvaro.study;

import com.alvaro.study.domain.vos.Product;
import com.alvaro.study.outbound.entities.ClientEntity;
import com.alvaro.study.outbound.entities.ProductEntity;
import com.alvaro.study.outbound.repositories.ClientRepository;
import com.alvaro.study.outbound.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class StudyApplication implements CommandLineRunner {

    @Autowired
    //private final ClientRepository repository;
    private final ProductRepository productRepository;

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*
        ProductEntity product1 = new ProductEntity("1","Tiranosaurio de juguete","Juguetes",3.50,"Un adorable dinosaurio de juguete");
        ProductEntity product2 = new ProductEntity("2","Plumbus","herramientas",99.99,"Todos tenemos uno en casa");

        List<ProductEntity> products1 = new ArrayList<ProductEntity>();
        List<ProductEntity> products2 = new ArrayList<ProductEntity>();
        products1.add(product1);
        products2.add(product2);

        Flux.just(
                        new ClientEntity(null,"uno","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"dos","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"tres","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"cuatro","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"cinco","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"seis","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"siete","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"ocho","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"nueve","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"diez","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"once","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"doce","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"trece","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"catorce","perez","lopez",12,false,products1,products2),
                        new ClientEntity(null,"quince","perez","lopez",12,false,products1,products2)
                )
                .flatMap(client -> repository.save(client))
                .subscribe(client -> log.info("Insert: "+client.getName()));

*/
        /*
        Flux.just(
                        new ProductEntity("1", "Tiranosaurio de juguete", "Juguetes", 3.50, "Un adorable dinosaurio de juguete"),
                        new ProductEntity("2", "Plumbus", "herramientas", 99.99, "Todos tenemos uno en casa")
                )
                .flatMap(productRepository::save)
                .subscribe(product -> log.info("Insert Product: " + product.getName()));
*/
    }
}
