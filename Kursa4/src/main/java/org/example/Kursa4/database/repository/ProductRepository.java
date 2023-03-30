package org.example.Kursa4.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursa4.database.entity.Category;
import org.example.Kursa4.database.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Transactional
    void deleteByName(@NotNull String name);

    Page<Product> findAllByTag (String tag, Pageable pageable);
}
