package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import com.spring.jpa.controller.Student;

public interface ServiceStudent {
public String message();
public String add(Student student);
public List<Student> getall();
public Optional<Student> getById(int id);
public String deleteById(int id);
public Student update(int id,Student student);
public String delete();
//public List<Student> findByName(String name);
public List<Student> getByName(String name);

}
