package com.jpadtocrud.service;

import java.util.List;

import com.jpadtocrud.controller.Student;
//import com.jpadtocrud.studentdto.StudentPayload;
import com.jpadtocrud.studentpayload.StudentDto;
public interface StudentService {
	public String message();
	public String add(StudentDto studentdto);
	public List<StudentDto> getall();
	public StudentDto getById(int id);
	public String deleteById(int id);
	public StudentDto update(int id,StudentDto studentDto);
	public String delete();
	public List<StudentDto> findByFname(String fname);
	public List<StudentDto> findByLname(String lname);
	public List<StudentDto> findByCity(String city);
	public List<StudentDto> findByFnameNative(String Fname);
	public List<StudentDto> findByFnameAndLname(String fname,String lname);
	public List<StudentDto> findByEmailid(String emailid);
	public List<StudentDto> findByAgeGreaterEquals(int age);
	public List<StudentDto> findByAge(int value1,int value2);
	public List<StudentDto> findByFnameLike(String fname);
	public List<StudentDto> findByFnameLikeEnds(String fname);
	public List<StudentDto> findByFnameLikeContaining(String fname);
}
