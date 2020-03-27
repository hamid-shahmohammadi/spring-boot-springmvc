package com.iranlaravel.springmvc.springmvc.boot;

import com.iranlaravel.springmvc.springmvc.model.Product;
import com.iranlaravel.springmvc.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1=new Product();
        product1.setName("Book1");
        product1.setDescription("this is book");
        product1.setType("honar");
        product1.setCategory("farhangi");
        product1.setPrice(12.9);

        productRepository.save(product1);

        Product product2=new Product();
        product2.setName("Book2");
        product2.setDescription("this is book2");
        product2.setType("honar2");
        product2.setCategory("farhangi2");
        product2.setPrice(14.9);

        productRepository.save(product2);

    }
}
