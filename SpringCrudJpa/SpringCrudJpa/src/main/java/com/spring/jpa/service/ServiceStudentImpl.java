package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.spring.jpa.controller.Student;
import com.spring.jpa.repo.StudentRepo;

@Service

public class ServiceStudentImpl implements ServiceStudent {
	@Autowired
	private StudentRepo studentreop;
	@Override
	public String message() {
		return "hello world";
	}

	@Override
	public String add(Student student) {
		
		studentreop.save(student) ;
		return "Details Added";
	}

	@Override
	public List<Student> getall() {
		return studentreop.findAll();
		
	}

	@Override
	public Optional<Student> getById(int id) {
		
		return studentreop.findById(id);
	}
	@Override
	public String deleteById(int id) {
		studentreop.deleteById(id);
		return "student Details Removed";
	}

	@Override
	public Student update(int id,Student student) {
		Student stu=studentreop.findById(id).get();
		if(stu!=null && id==student.getId())
		{
//			stu.setName(student.getName());
//			stu.setEmail(student.getEmail());
//			stu.setPassword(student.getPassword());
			studentreop.save(student);
			return student;
		}
		return null;
	}

	@Override
	public String delete() {
		studentreop.deleteAll();
		return "All Student Details Deleted";
	}

	@Override
	public List<Student> getByName(String name) {
		return studentreop.findByName(name);
	
	}
}
