package com.studentjpacrud.studentpayload;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddressDto {
	
	@NotEmpty
	private String street;
	
	@NotEmpty
	private String city;
	
	@NotEmpty
	private String state;
	
	@NotEmpty(message="can not be empty")
	@Pattern(regexp="^[0-9]{6}" ,message="Invalid Zip Code")
	private String zipcode;
}
