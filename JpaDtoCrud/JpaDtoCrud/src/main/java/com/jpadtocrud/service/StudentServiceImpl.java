package com.jpadtocrud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpadtocrud.controller.Student;
import com.jpadtocrud.repository.StudentRepository;
//import com.jpadtocrud.studentdto.StudentPayload;
import com.jpadtocrud.studentpayload.StudentDto;

import exception.ResourceNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String message() {

		return "Hello World";
	}

	public String add(StudentDto student) {
		studentRepository.save(this.DtoToStudent(student));
		return "Added Successfully";
	}

	@Override
	public List<StudentDto> getall() {
		//List<Student> student = studentRepository.findAll();
		return studentRepository.findAll().stream().map(this::studentToDto).collect(Collectors.toList());
		//return student.stream().map((x)->modelMapper.map(student,StudentDto.class)).collect(Collectors.toList());
		//return this.studentToDto();

	}

	@Override
	public StudentDto getById(int id) {
		Student student = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student Not Found"));
		return this.studentToDto(student);
	}

	@Override
	public String deleteById(int id) {
		studentRepository.deleteById(id);
		return null;
	}

	@Override
	public StudentDto update(int id, StudentDto student) {
		Student stu1 = this.studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student Not Found"));
		// student.setId(id);
//		Student student=DtoToStudent(student1);

		stu1.setFname(student.getFname());
		stu1.setLname(student.getLname());
		stu1.setCity(student.getCity());
		stu1.setPhoneno(student.getPhoneno());
		stu1.setPassword(student.getPassword());
		studentRepository.save(stu1);
		//System.out.println(stu1);
		return studentToDto(stu1);
	}

	@Override
	public String delete() {
		studentRepository.deleteAll();
		return null;
	}

	@Override
	public List<StudentDto> findByFname(String fname) {

		return this.studentRepository.findByFname(fname).stream().map(x -> studentToDto(x))
				.collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findByLname(String lname) {
		return this.studentRepository.findByLname(lname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findByCity(String city) {
		return this.studentRepository.findByCity(city).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByFnameNative(String fname) {
		
		return this.studentRepository.findByFnameNative(fname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByFnameAndLname(String fname, String lname) {
		return this.studentRepository.findByFnameAndLname(fname, lname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByEmailid(String emailid) {
				
		List<Student> findByEmailid = studentRepository.findByEmailid(emailid);
		return this.studentRepository.findByEmailid(emailid).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findByAgeGreaterEquals(int age) {
		List<Student> findByAgeGreaterEquals = studentRepository.findByAgeGreaterEquals(age);
		return this.studentRepository.findByAgeGreaterEquals(age).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByAge(int value1, int value2) {
		List<Student> findByAgeBetween = studentRepository.findByAge(value1, value2);
		return this.studentRepository.findByAge(value1, value2).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByFnameLike(String fname) {
			List<Student> findByFnameLike = studentRepository.findByFnameLike(fname);
		return this.studentRepository.findByFnameLike(fname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByFnameLikeEnds(String fname) {
		List<Student> findByFnameLikeEnds = studentRepository.findByFnameLikeEnds(fname);
		return this.studentRepository.findByFnameLikeEnds(fname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByFnameLikeContaining(String fname) {
	List<Student> findByFnameLikeContaining = studentRepository.findByFnameLikeContaining(fname);
	return this.studentRepository.findByFnameLikeContaining(fname).stream().map(x->studentToDto(x)).collect(Collectors.toList());
	}
	
	//MODEL MAPPER METHODS
	private  StudentDto studentToDto(Student student) {
		
			StudentDto studentdto = this.modelMapper.map(student,StudentDto.class);
		
		return studentdto;
	}

	private  Student DtoToStudent(StudentDto studentdto) {
		
		Student student = this.modelMapper.map(studentdto, Student.class);
		return student;
	}
}
