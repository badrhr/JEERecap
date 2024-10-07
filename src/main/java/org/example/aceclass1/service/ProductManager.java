package org.example.aceclass1.service;

import org.example.aceclass1.dao.entities.Product;

import java.util.List;

public interface ProductManager {

    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Product product);
    public Product getProduct(Integer id);
    public List<Product> getProducts();
}
