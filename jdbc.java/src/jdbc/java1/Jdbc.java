package jdbc.java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
     public static void main(String[]args) {
    	 String driverName="com.mysql.cj.jdbc.Driver";
    	 String URL="jdbc:mysql://localhost:3306/ecommerce";
			String userid="root";
			String password="3126";
    	 try {
    		//1)load the driver
			Class.forName(driverName);
			System.out.println("driver loaded");
			//2)establishment of connection
		    Connection con=	DriverManager.getConnection(URL, userid, password);
			System.out.println("connection established");
			//3)obtain the statement
			Statement stmt=con.createStatement();//
			System.out.println("statement created");
			//4)execute sql query
			String sqlQuery="select roll_no,name,score,dob from student";
			ResultSet recordSet=stmt.executeQuery(sqlQuery);
			System.out.println("sql query executed");
			while(recordSet.next()) {
			int rollno=	recordSet.getInt(1);
			String name=recordSet.getString(2);
			Double score=recordSet.getDouble(3);
			System.out.println(rollno+name+score);
			
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	
}
