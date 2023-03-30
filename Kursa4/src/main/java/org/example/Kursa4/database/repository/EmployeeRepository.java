package org.example.Kursa4.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursa4.database.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

    @Transactional
    void deleteBySurname(@NotNull String surname);
}
