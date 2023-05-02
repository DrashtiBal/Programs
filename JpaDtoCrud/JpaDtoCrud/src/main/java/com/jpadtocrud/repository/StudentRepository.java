package com.jpadtocrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpadtocrud.controller.Student;
import com.jpadtocrud.studentpayload.StudentDto;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByFname(String fname);
	public List<Student> findByLname(String lname);
	public List<Student> findByCity(String city);
	
	@Query(value="SELECT * FROM studentTB2 WHERE fname=?",nativeQuery=true)
	public List<Student> findByFnameNative(String fname);
	
	@Query("SELECT student FROM Student student WHERE student.fname=:fname AND student.lname=:lname")
	public List<Student> findByFnameAndLname(@Param ("fname")String fname,@Param("lname")String lname);
	
	@Query("SELECT student FROM Student student WHERE student.emailid=:emailid")
	public List<Student> findByEmailid(@Param ("emailid")String emailid);
	
	@Query("SELECT student FROM Student student WHERE student.age>=:age")
	public List<Student> findByAgeGreaterEquals(@Param ("age") int age);
	
	//@Query(value="SELECT * FROM studentTB1  WHERE age BETWEEN ? AND ?",nativeQuery = true)
	@Query( "SELECT student FROM Student student WHERE student.age BETWEEN :value1 AND :value2")
	public List<Student> findByAge( @Param("value1")int value1,@Param("value2") int value2);
	
	@Query("SELECT student FROM Student student WHERE student.fname LIKE ?1%")
	public List<Student> findByFnameLike(@Param("fname") String fname);
	
	@Query("SELECT student FROM Student student WHERE student.fname LIKE %?1")
	public List<Student> findByFnameLikeEnds(@Param("fname") String fname);
	
	@Query("SELECT student FROM Student student WHERE student.fname LIKE %?1%")
	public List<Student> findByFnameLikeContaining(@Param("fname")String fname);
}
