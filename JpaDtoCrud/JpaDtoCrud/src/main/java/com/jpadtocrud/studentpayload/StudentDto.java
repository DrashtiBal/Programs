package com.jpadtocrud.studentpayload;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {	
	
		
		private int id;
		
		@NotEmpty
		@Size(max=10,min=4,message="fname must be 4 characters long")
		private String fname;
		
		@NotEmpty
		@Size(max=10,min=4,message="lname must be 4 characters long")
		private String lname;
		
		private String city;
		
		@Pattern(regexp="^\\d{10}$",message="Invalid Phone No")
		private String phoneno;
		
		@Range(min=18)
		private int age;
		
		@Pattern(regexp="^[A-Za-z0-9+_-]+@(.+)",message="Invalid Email id")
		private String emailid;
		
		@Pattern(regexp="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*", message="password value not satisfied")
		private String password;
			
	}
