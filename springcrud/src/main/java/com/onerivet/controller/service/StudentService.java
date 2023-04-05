package com.onerivet.controller.service;

import java.util.List;

import com.onerivet.controller.Student;

public interface StudentService {
	
	
public String getmessage();
public String addUser(Student stu);
public List<Student> getAllStudent();
public Student getStudentById(int id);
public String deleteStudentById(int id);
public Student updateStudent(int id,Student stu);


}
