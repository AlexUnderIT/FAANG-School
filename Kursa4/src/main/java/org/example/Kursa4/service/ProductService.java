package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAll();
    Product save(Product product);
    Optional<Product> findById(Long id);
    void deleteByName(String name);
    Page<Product> findAllByTag (String tag, Pageable pageable);
}
