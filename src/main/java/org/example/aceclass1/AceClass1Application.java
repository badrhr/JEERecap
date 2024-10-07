package org.example.aceclass1;

import org.example.aceclass1.dao.entities.Product;
import org.example.aceclass1.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AceClass1Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;


    public static void main(String[] args) {
        SpringApplication.run(AceClass1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product(null, "Clavier", "Mec Keyboard", 2000);
        Product product2 = new Product(null, "Pc", "Gaming ", 7000);
        Product product3 = new Product(null, "Tv", "S8", 2000);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
    }
}
