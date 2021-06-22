package com.example.codeclan.employeeRelations;

import models.Department;
import models.Project;
import models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repositories.DepartmentRepository;
import repositories.EmployeeRepository;
import repositories.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeRelationsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	Department sales = new Department("Sales");
	departmentRepository.save(sales);

	Employee employee1 = new Employee("Ron", "Laflamme", 12345, sales);
	employeeRepository.save(employee1);
}
