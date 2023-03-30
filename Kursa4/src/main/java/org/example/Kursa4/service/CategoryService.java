package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoryService {
    Iterable<Category> findAll();
    Category save(Category category);
    Optional<Category> findById(Long id);
    void deleteById(Long id);
    Page<Category> findByPart(String part, Pageable pageable);
}
