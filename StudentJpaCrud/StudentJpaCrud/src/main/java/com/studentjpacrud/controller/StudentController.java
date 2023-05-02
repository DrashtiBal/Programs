package com.studentjpacrud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.jpadtocrud.studentpayload.StudentDto;
import com.studentjpacrud.service.StudentServiceImpl;
import com.studentjpacrud.service.StudentServiceInterface;
import com.studentjpacrud.studentpayload.StudentDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/studentjpa")
public class StudentController {

	@Autowired
	private StudentServiceInterface studentserviceinterface;
	
	@PostMapping("/add")
	public String add(@Valid @RequestBody StudentDto studentdto)
	{
		studentserviceinterface.add(studentdto);
		return "Student Added";
	}
	
	@GetMapping("/get-all")
	public List<StudentDto> getAll()
	{
		return studentserviceinterface.getAll();
	}
	
	@GetMapping("/get-by-id/{id}")
	public StudentDto getById(@PathVariable int id)
	{
		return studentserviceinterface.getByStudentId(id);
	}
	
	@DeleteMapping("/delete-by-id/{id}")
	public String deleteById(@PathVariable int id)
	{
		this.studentserviceinterface.deleteById(id);
		return "deleted";
	
	}
	
	@DeleteMapping("/delete-all")
	public String deleteAll()
	{
		 studentserviceinterface.deleteAll();
		 return "Student has been removed from list";
	}
	
	@PutMapping("/update-student/{id}")
	public StudentDto update(@PathVariable int id,@RequestBody StudentDto studentDto)
	{
		 return studentserviceinterface.update(id, studentDto);
		 
	}
	
	@GetMapping("/deptdetails/{id}")
	public List<String> getDeptDetails(@PathVariable  int id)
	{
		return studentserviceinterface.getDeptDetail1(id);
	}
}
