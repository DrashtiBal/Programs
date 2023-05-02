package com.studentjpacrud.controller;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class StudentAddress {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
}
