package com.example.codeclan.employeeRelations.repositories;

import com.example.codeclan.employeeRelations.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
