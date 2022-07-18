package com.alvaro.study.commons.mappers;

import com.alvaro.study.commons.dto.ProductDto;
import com.alvaro.study.domain.vos.Product;
import com.alvaro.study.outbound.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto entityToDto(ProductEntity product){
        return new ProductDto(product.getId(), product.getName(), product.getCategory(), product.getPrice(), product.getDescription());
    }

    public Product entityToVos(ProductEntity product){
        return new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice(), product.getDescription());
    }

    public ProductDto vosToDto(Product product){
        return new ProductDto(product.getId(), product.getName(), product.getCategory(), product.getPrice(), product.getDescription());
    }

    public Product dtoToVos(ProductDto product){
        return new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice(), product.getDescription());
    }
}
