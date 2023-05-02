package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeepayload.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.payload.AuthRequestDto;
import com.employee.service.EmployeeService;
import com.employee.service.JwtService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/add")
	public String addEmployee(@RequestBody EmployeeDto employeedto) {
		employeeService.addEmployee(employeedto);
		return "added";
	}

	@GetMapping("/get-all")
	 @PreAuthorize("hasRole('ROLE_ADMIN')")
	public List<Employee> getAll(@RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "5") int pageSize,

			@RequestParam(value = "sort", defaultValue = "ename") String sort) {
		
		//System.out.println("hi");
		return employeeService.getAllEmployee(pageNo, pageSize, sort);

	}
	
	
	@PostMapping("/authentication")
	public String authenticateAndGenerateToken(@RequestBody AuthRequestDto authRequestDto )
	{
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.getEmail(), authRequestDto.getPassword()));
		if(authenticate.isAuthenticated())
		{
			return jwtService.generateToken(authRequestDto.getEmail());
		}
		else
		{
			throw new UsernameNotFoundException("Invalid User");
		}
		
	}
	
	@GetMapping("/get-by-id/{id}")
	@PreAuthorize("hasRole('ROLE_USER')")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
}
