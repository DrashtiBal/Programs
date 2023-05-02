package com.studentjpacrud.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.studentjpacrud.studentpayload.StudentDto;

//import com.jpadtocrud.studentpayload.StudentDto;

public interface StudentServiceInterface {

	public String add(StudentDto studentdto);
	public List<StudentDto> getAll();
	public StudentDto getByStudentId(int id);
	public String deleteById(int id);
	public String deleteAll();
	public StudentDto update(int id,StudentDto studentdto);
	public List<String> getDeptDetail1(int id);
	
}
