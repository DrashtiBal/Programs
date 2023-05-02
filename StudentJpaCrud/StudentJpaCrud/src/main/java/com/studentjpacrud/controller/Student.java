package com.studentjpacrud.controller;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="studenttb3")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private StudentAddress address;
	private String phoneno;
	private int age;
	private String emailid;
	private String password;
	
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="deptId" ,referencedColumnName="id")
	private StudentDepartment department;
	
	@OneToMany(targetEntity = Subjects.class,cascade = CascadeType.ALL)
	@JoinColumn(name="subid",referencedColumnName = "id")
	private List<Subjects> subjects;
}
