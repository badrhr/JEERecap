package org.example.aceclass1.dao.repositories;

import org.example.aceclass1.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
