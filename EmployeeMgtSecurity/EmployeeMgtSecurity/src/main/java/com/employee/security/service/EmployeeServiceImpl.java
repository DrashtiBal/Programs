package com.employee.security.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.security.employee.Employee;
import com.employee.security.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String add(Employee employee) {
		employeeRepository.save(employee);
		return "Employee details added";
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeRepository.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Employee getByStudentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
