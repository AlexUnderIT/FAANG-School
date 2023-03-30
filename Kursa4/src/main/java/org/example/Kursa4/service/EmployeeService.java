package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Employee;

import java.util.Optional;

public interface EmployeeService {
    Iterable<Employee> findAll();
    Employee save(Employee employee);
    Optional<Employee> findById(Long id);
    void deleteBySurname(String surname);
}
