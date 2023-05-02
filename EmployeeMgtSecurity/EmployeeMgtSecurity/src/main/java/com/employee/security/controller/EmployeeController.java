package com.employee.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.security.employee.Employee;
import com.employee.security.service.EmployeeService;
//import com.studentjpacrud.studentpayload.StudentDto;

//import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/deskbook")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public String add( @RequestBody Employee employee)
	{
		employeeService.add(employee);
		return "Student Added";
	}
	
	@GetMapping("/get-all")
	public List<Employee> getAll()
	{
		return employeeService.getAll();
	}
	@GetMapping
	public String display(String name)
	{
		System.out.println("Name="+name);
		return name;
	}
}
