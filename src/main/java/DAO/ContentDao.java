package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Content;
import repo.ContentRepo;

public class ContentDao {
	ContentRepo repo=new ContentRepo();
	public ArrayList<Content> findAllDao(){
		return repo.selectAll();
		
		
	}

	
	
}
