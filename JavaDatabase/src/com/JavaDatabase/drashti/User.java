package com.JavaDatabase.drashti;

public class User {

	private int Eid;
	private String Fname;
	private String Lname;
	private String City;
	private int Salary;
	private int Age;
	
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		this.Eid=eid;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname=fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		this.Lname = lname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		this.Salary = salary;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
		
	
	@Override
	public String toString() {
	 
		return "Eid:" +Eid+ "\n"+ "Fname:" +Fname+ "\n"+ "Lname:"  +Lname+ "\n"+ "City:" +City+ "\n"+ "Age:" +Age+ "\n"+ "Salary:" +Salary;
}
	public static boolean isNull(User u) {
		return true;
	}
}
