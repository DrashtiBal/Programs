package com.studentjpacrud.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.studentjpacrud.controller.Student;
import com.studentjpacrud.controller.StudentAddress;
import com.studentjpacrud.controller.StudentDepartment;
import com.studentjpacrud.exception.ResourceNotFoundException;
import com.studentjpacrud.repository.StudentRepository;
import com.studentjpacrud.studentpayload.StudentDto;
@Service
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String add(StudentDto student) {
		Student studentnew = this.StudentDtoToStudent(student);
		studentnew.getDepartment().setStudent(studentnew);
		//studentnew.getSubjects()
		studentRepository.save(studentnew);
		return "Student Added";
	}

	@Override
	public List<StudentDto> getAll() {
		return studentRepository.findAll().stream().map(this::studentToDto).collect(Collectors.toList());
	}
	
	@Override
	public StudentDto getByStudentId(int id) {
		
//		try {
//		Student student = studentRepository.findById(id).get();
//		return this.studentToDto(student);
//		}
//		catch(Reso)
		Student student = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User Not Found"));
		return this.studentToDto(student) ;
		
	}
	
	@Override
	public String deleteById(int id) {
		//Student student1=this.StudentDtoToStudent(this.getById(id));
	
		Student student = this.StudentDtoToStudent( this.getByStudentId(id));
//		System.out.println(byId);
//		Student student1 = this.StudentDtoToStudent(byId);
//		//studentRepository.deleteById(id);
//		System.out.println(student1);
		studentRepository.delete(student);
		return "Student has removed";
	}
	
	@Override
	public String deleteAll()
	{
		studentRepository.deleteAll();
		return "All Student have removed";
		
	}
	
	@Override
	public StudentDto update(int id, StudentDto studentdto) {
		
		Student student = this.StudentDtoToStudent(this.getByStudentId(id));
		//Student student = studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User Not found"));
		
		//studentdto.setId(student.getId());
		
		studentdto.getDepartment().setId(student.getDepartment().getId());
		if(studentdto.getFname()!= null) {
			student.setFname(studentdto.getFname());
		}else if(studentdto.getLname()!=null) {
			student.setLname(studentdto.getLname());
		}
//		student.setFname(studentdto.getFname());
//		student.setLname(studentdto.getLname());
		student.setAddress(this.modelMapper.map(studentdto.getAddress(), StudentAddress.class));
		student.setAge(studentdto.getAge());
		student.setPhoneno(studentdto.getPhoneno());
		student.setEmailid(studentdto.getEmailid());
		student.setPassword(studentdto.getPassword());
		student.setDepartment(this.modelMapper.map(studentdto.getDepartment(), StudentDepartment.class));
		student.getDepartment().setStudent(student);
		studentRepository.save(student);
		return studentToDto(student);
	}
	
	@Override
	public List<String> getDeptDetail1(int id) {
		// TODO Auto-generated method stub
		return this.studentRepository.getDeptDetail(id);
	}
	
	
	public StudentDto studentToDto(Student student)
	{
		StudentDto studentdto = this.modelMapper.map(student, StudentDto.class);
		return studentdto;
	}
	public Student StudentDtoToStudent(StudentDto studentdto)
	{
		Student student = this.modelMapper.map(studentdto, Student.class);
		return student;
	}

	
//	  @Override public String deleteById(int id) { 
//		  Student student =this.studentRepository.findById(id).get();
//	  this.studentRepository.delete(student); return "deleted"; }
	 
}
