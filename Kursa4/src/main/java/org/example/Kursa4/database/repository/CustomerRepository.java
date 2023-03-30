package org.example.Kursa4.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursa4.database.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Transactional
    void deleteBySurname(@NotNull String surname);
}
