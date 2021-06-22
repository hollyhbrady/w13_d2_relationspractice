package com.example.codeclan.employeeRelations;

import com.example.codeclan.employeeRelations.models.Department;
import com.example.codeclan.employeeRelations.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.codeclan.employeeRelations.repositories.DepartmentRepository;
import com.example.codeclan.employeeRelations.repositories.EmployeeRepository;
//import com.example.codeclan.employeeRelations.repositories.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRelationsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

//	@Autowired
//	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department sales = new Department("Sales");
		departmentRepository.save(sales);

		Employee employee1 = new Employee("Ron", "Laflamme", 12345, sales);
		employeeRepository.save(employee1);
	}
}
