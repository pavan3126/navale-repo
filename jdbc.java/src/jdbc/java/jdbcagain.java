package jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcagain {

	public static void main(String[] args) {
		String drivername="com.mysql.cj.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/ecommerce";
		String userid="root";
		String password="3126";
		 try {
			Class.forName(drivername);
			System.out.println("1");
			
			Connection con=DriverManager.getConnection(URL, userid, password);
				System.out.println("2");
			    Statement stmt=	con.createStatement();
			  ResultSet record=  stmt.executeQuery("select roll_no,name,score from student");
			    while(record.next()) {
			    	int roll_no=record.getInt(1);
			    	String name=record.getString(2);
			    	Double score=record.getDouble(3);
			    	System.out.println(roll_no+name+score);
			    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
