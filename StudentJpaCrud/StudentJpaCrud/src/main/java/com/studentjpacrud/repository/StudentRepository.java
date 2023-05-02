package com.studentjpacrud.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentjpacrud.controller.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

//	@Query(value="SELECT sd.dept_name dname, deptfaculty dfaculty  FROM studenttb3 s INNER JOIN student_dept sd ON s.dept_id=sd.id WHERE s.dept_id=?", nativeQuery = true)
	@Query(value="SELECT s.fname Fname, s.lname Lname ,sd.deptName Deptname, sd.deptfaculty DeptFaculty FROM Student s JOIN s.department sd WHERE s.id=:id")
	public List<String> getDeptDetail(int id); 
}
