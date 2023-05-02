package com.employee.security.service;

import java.util.List;

import com.employee.security.employee.Employee;

//import com.studentjpacrud.studentpayload.StudentDto;

public interface EmployeeService {

	public String add(Employee employee);
	public List<Employee> getAll();
	public Employee getByStudentId(int id);
	public String deleteById(int id);
	public String deleteAll();
	public Employee update(int id,Employee employee);
}
