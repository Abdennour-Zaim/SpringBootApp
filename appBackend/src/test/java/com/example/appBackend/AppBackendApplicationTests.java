package com.example.appBackend;

import com.example.appBackend.model.Employee;
import com.example.appBackend.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppBackendApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	public void TestCreateEmployee(){
		Employee employee=new Employee("Jhon","Wick","JohnWick@gmail.com");
		employeeRepository.save(employee);

	}

}
