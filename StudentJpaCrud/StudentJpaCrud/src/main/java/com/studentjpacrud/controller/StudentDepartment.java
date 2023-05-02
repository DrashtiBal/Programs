package com.studentjpacrud.controller;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="studentDept")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDepartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String deptName;
	private String deptfaculty; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	
	
}
