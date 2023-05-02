package com.jpadtocrud.controller;

import java.util.List;
import java.util.Optional;

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

import com.jpadtocrud.service.StudentService;
//import com.jpadtocrud.studentdto.StudentPayload;
import com.jpadtocrud.studentpayload.StudentDto;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/studentdto")
public class ControllerStudent {
	@Autowired
	private StudentService studentService;

	@GetMapping("/mesage")
	public String message() {
		return studentService.message();
	}

	@PostMapping("/add")
	public String add(@Valid@RequestBody StudentDto studentdto) {
		studentService.add(studentdto);
		return " Student added";
	}

	@GetMapping("/getall")
	public List<StudentDto> getall() {
		return studentService.getall();

	}

	@GetMapping("/getbyid/{id}")
	public StudentDto getById(@PathVariable int id) {
		return studentService.getById(id);
	}

	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		studentService.deleteById(id);
		return "Student Deleted";
	}

	@DeleteMapping("/delete")
	public String delete() {
		studentService.delete();
		return "All Student Details Deleted";
	}

	@PutMapping("/update/{id}")
	public StudentDto update(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
		StudentDto update = studentService.update(id, studentDto);
		return update;
	}

	@GetMapping("/get-by-fname")
	public List<StudentDto> getByFname(@RequestParam String fname) {
		return studentService.findByFname(fname);
	}
	
	@GetMapping("/get-by-lname")
	public List<StudentDto> getByLname(String lname) {
		return studentService.findByLname(lname);
	}
	
	@GetMapping("/get-by-city")
	public List<StudentDto> getByCity(String city) {
		return studentService.findByCity(city);
	}
	
	@GetMapping("/get-by-fnamenative")
	public List<StudentDto> getByFnameNative(String fname) {
		return studentService.findByFnameNative(fname);
	}
	
	@GetMapping("/get-by-fnamelname")
	public List<StudentDto> getByFnameAndLname(String fname,String lname) {
		return studentService.findByFnameAndLname(fname,lname);
	}
	
	@GetMapping("/get-by-email")
	public List<StudentDto> getByEmail(String emailid)
	{
		return studentService.findByEmailid(emailid);
	}
	
	@GetMapping("/age-greater-equals")
	public List<StudentDto> getByAgeGreaterEquals(int age )
	{
		return studentService.findByAgeGreaterEquals(age);
	}
	
	@GetMapping("/age-between")
	public List<StudentDto> getByAge(int value1,int value2)
	{
		return studentService.findByAge(value1, value2);
	}
	
	@GetMapping("/get-by-fname-like")
	public List<StudentDto> getByFnameLike(String fname)
	{
		return studentService.findByFnameLike(fname);		
	}
	
	@GetMapping("/get-by-fname-like-ends")
	public List<StudentDto> getByFnameLikeEnds(String fname)
	{
		return studentService.findByFnameLikeEnds(fname);		
	}
	
	@GetMapping("/get-by-fname-like-containing")
	public List<StudentDto> getByFnameLikeContaining(String fname)
	{
		return studentService.findByFnameLikeContaining(fname);		
	}
}
