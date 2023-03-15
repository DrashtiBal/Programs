package com.jspServlet.drashti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Employee1DAO {

	static Connection connection;
	static PreparedStatement ps;
	static Statement s;
	static ResultSet r;
	static int rs;

	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;database=emp2;encrypt=false";
		String user = "sa";
		String pwd = "admin#123";
		try {
			connection = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection Successful");
		} catch (Exception e) {
			System.out.println("Connection faild");
		}
		return connection;
	}

	public static int insertEmp(Employee1 e1) throws Exception {
		try {
			Connection connection = Employee1DAO.getConnection();
			ps = connection.prepareStatement("insert into employee2(name,email,password)Values(?,?,?)");
			// ps.setInt(1,e1.getId());
			ps.setString(1, e1.getName());
			ps.setString(2, e1.getEmail());
			ps.setString(3, e1.getPassword());
			rs = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static List<Employee1> viewAllUser() throws ClassNotFoundException, Exception {
		List<Employee1> l2 = new ArrayList();
		Connection connection = Employee1DAO.getConnection();
		String s1 = "select * from employee2";
		s = connection.createStatement();
		r = s.executeQuery(s1);
		while (r.next()) {
			Employee1 e1 = new Employee1();
			e1.setId(r.getInt(1));
			e1.setName(r.getString(2));
			e1.setEmail(r.getString(3));
			e1.setPassword(r.getString(4));
			l2.add(e1);
		}
		return l2;
	}

	public static int deleteByID(int eid) throws Exception {
		Connection connection = Employee1DAO.getConnection();
		ps = connection.prepareStatement("delete from employee2 where id=?");
		ps.setInt(1, eid);
		rs = ps.executeUpdate();
		return rs;
	}

	public static int updateUser(Employee1 e1) throws Exception {
		//int u1=0;
		try { 
		Connection connection = Employee1DAO.getConnection();
		ps = connection.prepareStatement("update employee2 set name=?,email=?,password=? where id=? ");
		ps.setInt(4, e1.getId());
		ps.setString(1, e1.getName());
		ps.setString(2, e1.getEmail());
		ps.setString(3, e1.getPassword());
		rs= ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("Invalid Input");
		}
		return rs;
	}
	public static Employee1 getUserById(int eid) {
		Employee1 e1 = new Employee1();
		try {
			Connection connection = Employee1DAO.getConnection();
			String q1 = "select * from employee2 where id=" + eid;
			s = connection.createStatement();
			r = s.executeQuery(q1);
			while (r.next()) {
				e1.setId(r.getInt(1));
				e1.setName(r.getString(2));
				e1.setEmail(r.getString(3));
				e1.setPassword(r.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return e1;
	} 
	public static Employee1 getUserByName(String name) {
		Employee1 e1 = new Employee1();
		try {
			Connection connection = Employee1DAO.getConnection();
			String q1 = "select * from employee2 where name='"+name+"'";
			s = connection.createStatement();
			r = s.executeQuery(q1);
			while (r.next()) {
				e1.setId(r.getInt(1));
				e1.setName(r.getString(2));
				e1.setEmail(r.getString(3));
				e1.setPassword(r.getString(4));
			}
			//return e1;
		} catch (Exception e) {
			e.printStackTrace();
			//return null;
			//return e1;
			//return null;
		}
		//return null;
		return e1;
	}
}
