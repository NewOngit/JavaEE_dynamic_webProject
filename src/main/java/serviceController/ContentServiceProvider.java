package serviceController;

import java.util.ArrayList;

import DAO.ContentDao;
import model.Content;

public class ContentServiceProvider {
	static ArrayList<Content>cart=new ArrayList<>();
	ContentDao dao=new ContentDao();
	
	public static ArrayList<Content> getCart() {
		return cart;
	}

	public static void setCart(ArrayList<Content> cart) {
		ContentServiceProvider.cart = cart;
	}
	
	
public void addcart(Content content) {
		
		cart.add(content);
		
	}
	
	public ArrayList<Content> findByCategories(String category){
		ArrayList<Content> al=new ArrayList<>();
		for(Content content :dao.findAllDao())
			if(content.getCategories().equalsIgnoreCase(category))
				al.add(content);
		return al;
	}

	public ArrayList<Content> getAll() {
		return dao.findAllDao();
		
	}

	public ArrayList<Content> getElementById(int id) {
		// TODO Auto-generated method stub
		ArrayList<Content> al=new ArrayList<Content>(); 
		for(Content content:dao.findAllDao()) {
			 if(content.getId()==id)
				 al.add(content);
		 }
		return al;
	}

	public void removeFromCart(Content content) {
		if(dao.findAllDao().contains(content)) {
			
		}
		
	}
	
	
}
