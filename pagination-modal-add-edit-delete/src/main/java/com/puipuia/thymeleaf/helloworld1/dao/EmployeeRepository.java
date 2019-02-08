package com.puipuia.thymeleaf.helloworld1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puipuia.thymeleaf.helloworld1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	
	
}
