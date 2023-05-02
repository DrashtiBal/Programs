package com.spring.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.controller.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name);
}
