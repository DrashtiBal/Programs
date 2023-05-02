package com.studentjpacrud.studentpayload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectsDto {

	private int id;
	private String subName;
	private String subFaculty;
	private String subCode;
}
