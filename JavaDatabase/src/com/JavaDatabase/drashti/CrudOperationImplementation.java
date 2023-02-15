package com.JavaDatabase.drashti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperationImplementation implements CrudOperation {
    Scanner s=new Scanner(System.in);
	static PreparedStatement ps;
	static ResultSet rs;
	static Connection connection;
	static Statement st;
	public static Connection getConnection() {
//public static void main(String[] args) {

		String url = "jdbc:sqlserver://localhost:1433;database=Emp1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String password = "admin#123";
		try {
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("Conncetion Succesful");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
	public void insertUser(User u) {
		try {
			ps=connection.prepareStatement("insert into Employee(Eid,Fname,Lname,City,Age,Salary)Values(?,?,?,?,?,?)");
				System.out.println("Enter Employee Id:");
				ps.setInt(1,s.nextInt());
				System.out.println("Enter Empoyee FName:");
				ps.setString(2,s.next());
				System.out.println("Enter Employee Lname:");
				ps.setString(3,s.next());
				System.out.println("Enter Empoyee City:");
				ps.setString(4,s.next());
				System.out.println("Enter Empoyee Age:");
				ps.setInt(5,s.nextInt());
				System.out.println("Enter Empoyee Salary:");
				ps.setInt(6,s.nextInt());
			//ps=connection.prepareStatement("insert into Employee(Eid,Fname,Lname,City,Age,Salary)Values(?,?,?,?,?,?)");
			int rs=ps.executeUpdate();
			System.out.println("data inserted successfully");
			
			
		}
		  catch (SQLException e) {
			
			System.out.println("can not enter duplicate value");
		}
	}

	@Override
	public void getAllUser() {
		
		String Query="Select * From Employee";
		try {
			Statement st=connection.createStatement();
			rs=st.executeQuery(Query);
			while(rs.next())
			{
				System.out.print("id: "+rs.getInt("Eid"));
				  System.out.print("\tFname: "+rs.getString("Fname"));
				  System.out.print("\tLname: "+rs.getString("Lname"));
				  System.out.print("\tCity: "+rs.getString("City"));
				  System.out.print("\tAge: "+rs.getInt("Age"));
				  System.out.print("\tSalary: "+rs.getInt("Salary"));
				  
				  System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Data Not Found");
			
		}
	}

	@Override
	public void getSingleUser(int eid) {
		
		System.out.println("Enter Employee Id:");
		try {
			ps.setInt(1,s.nextInt());
			ps=connection.prepareStatement("Select Fname,Fname,City,age,salary from Employee where Eid=?");
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAllUser(User u) {
		try {
			ps=connection.prepareStatement("Delete * from Employee");
			int rs=ps.executeUpdate();
			System.out.println("Data has been deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no data found");
		}
		
	}

	@Override
	public void deleteSingleuser(int eid) {
		String SQL2 = "delete from Employee where Eid=?";
		try {
			ps=connection.prepareStatement(SQL2);
			int rs=ps.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateSingleUser(int eid) {
		System.out.println("Enter Employee Id:");
		try {
			ps.setInt(1,s.nextInt());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter name to be updated FName:");
		try {
			ps.setString(2,s.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter name to be updated Employee Lname:");
		try {
			ps.setString(3,s.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql ="UPDATE Employee SET fname=?, Lname=?, WHERE eid=?";
			try {
				ps=connection.prepareStatement(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				int rs=ps.executeUpdate();
				System.out.println("data is updated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	
	
}
