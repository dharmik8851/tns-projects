package layred_architecture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	
	static {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection established");
		
	}
	catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e2) {
		e2.printStackTrace();
	}
	}
	
	public static Connection getConnection() {
		return cn;
	}

}
