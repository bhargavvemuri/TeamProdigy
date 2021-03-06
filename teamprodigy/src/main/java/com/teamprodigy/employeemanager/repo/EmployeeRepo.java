package com.teamprodigy.employeemanager.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.teamprodigy.employeemanager.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}