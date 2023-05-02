package com.studentjpacrud.studentpayload;

import java.util.List;

import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

import com.studentjpacrud.controller.StudentAddress;
import com.studentjpacrud.controller.Subjects;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {
	
	private int id;
	
	@NotEmpty(message="Fname Must Not be Empty")
	@Size(max=10,min=4,message="fname must be 4 characters long")
	private String fname;
	
	@NotEmpty(message="Lname Must Not be Empty")
	@Size(max=10,min=4,message="lname must be 4 characters long")
	private String lname;
	
	//@NotEmpty(message="Address Must Not be Empty")
	@Valid
	private StudentAddressDto address;
	
	@NotEmpty(message="Phone No Must Not be Empty")
	@Pattern(regexp="^\\d{10}$",message="Invalid Phone No")
	private String phoneno;
	
	//@NotEmpty(message="Email Must Not be Empty")
	@Range(min=18)
	private int age;
	
	@NotEmpty(message="Email Must Not be Empty")
	@Pattern(regexp="^[A-Za-z0-9+_-]+@(.+)",message="Invalid Email id")
	private String emailid;
	
	@NotEmpty(message="Password Must Not be Empty")
	@Pattern(regexp="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*", message="password value not satisfied")
	private String password;
	
	private StudentDepartmentDto department;
	
	private List<Subjects> subjects;
}
