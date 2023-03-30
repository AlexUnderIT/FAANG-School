package org.example.Kursa4.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursa4.database.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Transactional
    void deleteById(@NotNull Long id);

    Page<Category> findAllByPart (String part, Pageable pageable);
}
