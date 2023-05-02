package com.studentjpacrud.studentpayload;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.studentjpacrud.controller.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDepartmentDto {
		
		private int id;
		private String deptName;
		private String deptfaculty; 
		
		@JsonIgnore
		private StudentDto student;
	}

