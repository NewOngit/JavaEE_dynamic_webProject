package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Content;
import repo.ContentRepo;



public class ContentDao {
	
	
	
	
	ContentRepo repo=new ContentRepo();
	public ArrayList<Content> findAllDao(){
		ArrayList<Content>content=new ArrayList<>();
		Connection con=repo.getConnection();
		
		//Connection con=ThingsRepo.getConnection();
		try {
        String query="select * from content";
        Statement stm=con.createStatement();
        ResultSet res=stm.executeQuery(query);
        
            while (res.next()) {

                int id = res.getInt(1);
                String name = res.getString(2);
                String desc = res.getString(4);
                int quantity = res.getInt(3);
                content.add(new Content(id, name, quantity, desc,"home applainces"));

            }
            
		}
		catch(Exception e) {
			e.printStackTrace();
		}
            return content;
		
	}

	
	
}
