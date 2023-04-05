package com.onerivet.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.controller.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {
	//private static List<Student> student = new LinkedList<Student>();
	
	@Autowired
	 private StudentService  studentService;
	
	
	@GetMapping("/get")
	public String get() {
		return studentService.getmessage();
	}
	
	@PostMapping("/add")
	public String addStudent (@RequestBody Student stu) {
		return studentService.addUser(stu);
	}

	@GetMapping("/getall")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/getbyid/{id}")
	public Student getUserById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {

		return studentService.deleteStudentById(id);
	}
	
	@PutMapping("/update")
	public Student update(@RequestParam int id,@RequestBody Student stu)
	{
		return studentService.updateStudent(id, stu);
	}
}
