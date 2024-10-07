package org.example.aceclass1.service;

import org.example.aceclass1.dao.entities.Product;
import org.example.aceclass1.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if (product.getPrice() > 0) {
            return productRepository.save(product);
        }
        return null;

    }

    @Override
    public Product updateProduct(Product product) {
        return addProduct(product);
    }

    @Override
    public Product deleteProduct(Product product) {
        try {
            productRepository.deleteById(product.getId());
            return product;
        }catch (Exception exception){
            return null ;
        }
    }

        @Override
        public Product getProduct (Integer id){
            return productRepository.findById(id).get();
        }

        @Override
        public List<Product> getProducts () {
            return productRepository.findAll();
        }
    }
