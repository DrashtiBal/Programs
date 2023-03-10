package com.JavaDatabase.drashti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperationImplementation implements CrudOperation {
	Scanner s = new Scanner(System.in);
	static PreparedStatement ps;
	static ResultSet rs;
	static Connection connection;
	static Statement st;

	public static Connection getConnection() {

		String url = "jdbc:sqlserver://localhost:1433;database=Emp;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String password = "admin#123";
		try {
			connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			System.out.println("Conncetion Succesful");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
	public void insertUser(User u) {
		try {
			ps = connection.prepareStatement("insert into employee(Eid,Fname,Lname,City,Age,Salary)Values(?,?,?,?,?,?)");
			System.out.println("Enter Employee Id:");
			ps.setInt(1, s.nextInt());
			System.out.println("Enter Empoyee FName:");
			ps.setString(2, s.next());
			System.out.println("Enter Employee Lname:");
			ps.setString(3, s.next());
			System.out.println("Enter Empoyee City:");
			ps.setString(4, s.next());
			System.out.println("Enter Empoyee Age:");
			ps.setInt(5, s.nextInt());
			System.out.println("Enter Empoyee Salary:");
			ps.setInt(6, s.nextInt());
			int rs = ps.executeUpdate();
			System.out.println("data inserted successfully");
			
			System.out.println("commit/rollback");  
			String answer=s.next(); 
			if(answer.equals("commit")){  
			connection.commit(); 
			}
			else
			{
				connection.rollback();
			}
		 /*catch (SQLException e) {
			System.out.println("can not enter duplicate value");
		}*/
	}
		catch (SQLException e) {
			System.out.println("can not enter duplicate value");
		}
	}
	@Override
	public void getAllUser() {

		String Query = "Select * From employee";
		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery(Query);
			while (rs.next()) {
				System.out.print("id: " + rs.getInt("Eid"));
				System.out.print("\tFname: " + rs.getString("Fname"));
				System.out.print("\tLname: " + rs.getString("Lname"));
				System.out.print("\tCity: " + rs.getString("City"));
				System.out.print("\tAge: " + rs.getInt("Age"));
				System.out.print("\tSalary: " + rs.getInt("Salary"));

				System.out.println();
			}
		} /*
			 * System.out.println("commit/rollback"); String answer=s.next();
			 */
		/*if(answer.equals("commit")){  
		connection.commit(); 
		}*/
			catch(SQLException f){
			System.out.println("Data Not Found");
		}
	}

	@Override
	public User getSingleUser(User u) {
		User u1 = new User();
		System.out.println("Enter employee Id:");
		try {
			String q1="Select * from Employee where Eid=?";
			st= connection.createStatement();
			ps.setInt(1, s.nextInt());
			rs = ps.executeQuery(q1);

			while (rs.next()) {
				u.setEid(rs.getInt("eid"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setCity(rs.getString("city"));
				u.setAge(rs.getInt("age"));
				u.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			System.out.println("Data Not Found");

		}
		return u;
	}

	@Override
	public void deleteAllUser() {
		try {
			ps = connection.prepareStatement("Delete from employee ");
			int rs = ps.executeUpdate();
			// System.out.println(rs);
			if (rs > 0) {
				System.out.println("Data has been deleted");
			} else {
				System.out.println("no data found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch bloc
			System.out.println("can not delete as it is reference");
			// e.printStackTrace();
		}

	}

	@Override
	public void deleteSingleuser() {
		System.out.println("Enter Eid:");
		int eid = s.nextInt();
		try {
			Statement st= connection.createStatement();
			int isDeleted = st.executeUpdate("Delete from employee where Eid='"+eid+"' ");
			
			if(isDeleted!= 0) 
				System.out.println("Deleted Successfully");
			else 
				System.out.println("User Not Found");
		}catch(SQLException e1)
				{
				e1.printStackTrace();
				}
	}
	@Override
	public User updateSingleUser(User u) {
		User u2 = new User();
		try {
			
			Statement st=connection.createStatement();
			System.out.println("Enter Employee Id:");
			int eid=s.nextInt();
			String sql = "UPDATE employee SET Fname=?,Lname=? WHERE Eid="+eid+" ";
			ps = connection.prepareStatement(sql);
			System.out.println("Enter Fname to be updated:");
			ps.setString(1, s.next());
			System.out.println("Enter Lname to be updated:");
			ps.setString(2, s.next());
			int rs = ps.executeUpdate();
			if(rs!=0)
			{
			System.out.println("Fname & Lname updated successfully ");
			}
			else
			{
				System.out.println("user not found");
		} 
			
	}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
		return u2;
}
}
