package jdbc.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilsTryWithResources {

	public static void main(String[] args) {
		String query="select* from customer";
	try
		(Connection connect=Utils.buildConnection();
	     Statement stmt=connect.createStatement();    ////this 3 statements are resourses
	     ResultSet result=   stmt.executeQuery(query))

			{
		while(result.next()) {
		String email=	result.getString(1);
		String fname=result.getString(2);
		System.out.println(email+fname);
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
