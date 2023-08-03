package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        Product product = new Product();
        product.setName("prod 1");
        product.setDescription("prod1 des");
        product.setSku("100AB");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("prod1.png");
        product.setDateCreated(LocalDate.parse("2007-12-03"));
        product.setLastUpdated(LocalDate.parse("2007-12-03"));

        Product savedObject = productRepository.save(product);

        System.out.println(savedObject.getName());
    }
}