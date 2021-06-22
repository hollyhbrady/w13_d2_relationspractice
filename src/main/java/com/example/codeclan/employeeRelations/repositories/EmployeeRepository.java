package com.example.codeclan.employeeRelations.repositories;

import com.example.codeclan.employeeRelations.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
