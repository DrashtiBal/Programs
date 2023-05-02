package com.spring.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.repo.StudentRepo;
import com.spring.jpa.service.ServiceStudent;
import com.spring.jpa.service.ServiceStudentImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private ServiceStudent serviceStudent ; 
	
	@GetMapping("/message")
	public String message()
	{
		return "hello world";
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		
		//studentrepo.save(student);
		return serviceStudent.add(student);
	}
	
	@GetMapping("/getall")
	public List<Student> getall()
	{
		return serviceStudent.getall();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Student> getById(@PathVariable int  id)
	{
		return serviceStudent.getById(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id)
	{
		  serviceStudent.deleteById(id);
		return "deleted";
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAll()
	{
		serviceStudent.delete();
		return "All Student Details Deleted";
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student student)
	{
		Student update = serviceStudent.update(id, student);
		return update;
	}
	@GetMapping("/getbyname")
	public List<Student> getByName1(String name)
	{
		return serviceStudent.getByName(name);
	}
}
