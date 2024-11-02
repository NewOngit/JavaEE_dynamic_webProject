package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Content;

public class ContentRepo {

	public Connection getConnection() {

		
		try {
			String url="jdbc:mysql://localhost:3306/ecommerse";
			String username="root";
			String password="Kumar@123";

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
	        


	            return con;

	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }

		
	


	return null;	
	}
}
