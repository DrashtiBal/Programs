package com.JavaDatabase.drashti;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	static Connection connection;
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
}
