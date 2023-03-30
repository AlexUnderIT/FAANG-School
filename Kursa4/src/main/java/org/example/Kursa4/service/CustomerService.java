package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
    void deleteBySurname(String surname);
}
