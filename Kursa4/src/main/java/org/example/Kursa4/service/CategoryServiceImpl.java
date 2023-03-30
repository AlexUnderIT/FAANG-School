package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Category;
import org.example.Kursa4.database.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl  implements  CategoryService{

    @Autowired
    private CategoryRepository repository;

    @Override
    public Iterable<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Category> findByPart(String part, Pageable pageable){
        return repository.findAllByPart(part, pageable);
    }
}
