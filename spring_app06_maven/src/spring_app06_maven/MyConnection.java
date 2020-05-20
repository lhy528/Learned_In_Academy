package spring_app06_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static MyConnection mc = null;
	private static Connection conn;
	
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String URL = "jdbc:mysql://localhost:3306/goott7";
	final String USER = "scott";
	final String PASSWORD = "tiger";
	
	private MyConnection() {}
	
	public static MyConnection getInstance() {
		if(mc==null) mc = new MyConnection();
		return mc;
	}
	
	public Connection getConnection() {
		if(conn==null) {
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
