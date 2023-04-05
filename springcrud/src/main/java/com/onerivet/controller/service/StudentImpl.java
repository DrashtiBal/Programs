package com.onerivet.controller.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.onerivet.controller.Student;

@Service
public class StudentImpl implements StudentService {

	private  List<Student> student = new LinkedList<Student>();
	
	@Override
	public String getmessage() {
		
		return "Hello World";
	}
	@Override
	public String addUser(Student stu) {
		student.add(stu);
		return "Add successfully";
	}
	@Override
	public List<Student> getAllStudent() {
		return student.stream().collect(Collectors.toList());
	}

	@Override
	public Student getStudentById(int id) {
		Student stu2;
//		Iterator<Student> iterator = student.iterator();
//		while (iterator.hasNext()) {
//			stu2 = iterator.next();
//			if (id == stu2.getId() && stu2 != null) {
//				return stu2;
//			}
//		}
		return student.stream().filter(x->x.getId()==id).toList().get(0);
		//return null;
	}

	@Override
	public String deleteStudentById(int id) {
		student.removeIf(i->i.getId()==(id));
//		Student stu1;
//		Iterator<Student> iterator = student.iterator();
//		while (iterator.hasNext()) {
//			stu1 = (Student) iterator.next();
//			if (id == stu1.getId() && stu1 != null) {
//				iterator.remove();
//			}
//		}
			return "Student Detail Removed";
	}

	@Override
	public Student updateStudent(int id, Student stu) {
		//int index=0;
//		Student stu2=new Student();
//		Iterator<Student> iterator = student.iterator();
//		while(iterator.hasNext())
//		{
//			Student stu2=(Student)iterator.next();
//			if (stu2.getId()==id){
//				break;
//			}
//			index++;
//		}
		//System.out.println(index);
		//System.out.println(stu.getId());
			stu.setId(id);
	int index = student.indexOf(student.stream().filter(x->x.getId()==id).toList().get(0));
			student.set(index, stu);
			return stu;
}
}
