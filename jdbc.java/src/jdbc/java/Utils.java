package jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utils {
public static Connection buildConnection() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String conurl=("jdbc:mysql://localhost:3306/ecommerce");
	String id="root";
	String password="3126";
	
	Connection con=DriverManager.getConnection(conurl, id, password); 
	return con;
	
}
}
//"jdbc:mysql://localhost:3306/ecommerce"