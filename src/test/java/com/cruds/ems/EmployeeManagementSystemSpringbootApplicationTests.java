package com.cruds.ems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeManagementSystemSpringbootApplicationTests {

	@Autowired
	private EmployeeRepository repo;
	
	@Test
	public void createEmployee() {
		Employee e = new Employee("Subrahmanya", "AV", 50000D);
		Employee employee = repo.save(e);
		
		assertThat(employee.getId()).isNotNull().isGreaterThan(0);
	}
	
	@Test
	public void listAll() {
		List<Employee> list = repo.findAll();
		list.forEach(employee -> System.out.println(employee));
	}
	
	@Test
	public void getId() {
		Employee e = repo.findById(1).get();
		System.out.println(e);
		
		assertThat(e.getId()).isNotNull();
	}
	
	@Test
	public void updateEmployee() {
		Employee e = repo.findById(1).get();
		e.setSalary(51000D);
		repo.save(e);
		System.out.println(e);
	}
	
	@Test
	public void deleteId(){
		int employeeId = 1;
		repo.deleteById(employeeId);
	}

}
