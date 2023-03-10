import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.JavaDatabase.drashti.User;

public class EmployeeDAO {

	static Connection connection;
	static PreparedStatement ps;
	static int rs;
	static Statement s;
	static ResultSet r;

	public static Connection getConnection() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;database=test; encrypt=false";
		String user = "sa";
		String password = "admin#123";
		try {
			connection = DriverManager.getConnection(url, user, password);
			// connection.setAutoCommit(false);
			System.out.println("Conncetion Succesful");
		} catch (Exception e) {
			System.out.println("Conncetion not Succesful");
			// System.out.println(e);
		}
		return connection;
	}

	public static int insertUser(Employee e1) throws Exception {
		try {
			Connection connection = EmployeeDAO.getConnection();
			ps = connection.prepareStatement("insert into employee1(id,name,email,password)Values(?,?,?,?)");
			ps.setInt(1, e1.getId());
			ps.setString(2, e1.getName());
			ps.setString(3, e1.getEmail());
			ps.setString(4, e1.getPassword());
			rs = ps.executeUpdate();
			connection.close();
		} catch (SQLException x) {
			System.out.println("can not enter duplicate value");
		}
		return rs;
	}

	public static List<Employee> GetAllUser() {

		List<Employee> l1 = new ArrayList<Employee>();
		try {
			Connection connection = EmployeeDAO.getConnection();
			String q = "select * from employee1";
			s = connection.createStatement();
			r = s.executeQuery(q);
			while (r.next()) {
				Employee e1 = new Employee();
				e1.setId(r.getInt(1));
				e1.setName(r.getString(2));
				e1.setEmail(r.getString(3));
				e1.setPassword(r.getString(4));
				l1.add(e1);
			}
			connection.close();
		} catch (Exception e) {
		}
		return l1;
	}

	public static int DeleteById(int eid) {
		int d = 0;
		try {
			Connection connection = EmployeeDAO.getConnection();
			ps = connection.prepareStatement("delete from employee1 where id=?");
			ps.setInt(1, eid);
			d = ps.executeUpdate();
			connection.close();
		} catch (Exception x) {
			System.out.println("User Not Found");
		}
		return d;
	}

	public static Employee GetUserById(int eid) {
		Employee e1 = new Employee();
		try {
			Connection connection = EmployeeDAO.getConnection();
			String q1 = "select * from employee1 where id=" + eid;
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

	public static int UpdateUser(Employee e1) {
		int u = 0;
		try {
			Connection connection = EmployeeDAO.getConnection();
			ps = connection.prepareStatement("update employee1 set name=?,email=?,password=? where id=?");
			ps.setInt(4, e1.getId());
			ps.setString(1, e1.getName());
			ps.setString(2, e1.getEmail());
			ps.setString(3, e1.getPassword());
			u = ps.executeUpdate();
			return u;
		} catch (Exception c) {
			c.printStackTrace();
		}
		return 0;
	}
}