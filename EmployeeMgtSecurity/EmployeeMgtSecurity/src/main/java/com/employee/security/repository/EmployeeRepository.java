package com.employee.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.security.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
