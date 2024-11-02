package repo;

import java.util.ArrayList;

import model.Content;

public class ContentRepo {

	public ArrayList<Content> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Content>content=new ArrayList<>();
        content.add(new Content(1,"fan",15,"fan speeed","electronic applainces"));
        content.add(new Content(2,"Electric Scooter",23,"Average is very good","electronic applainces"));
        content.add(new Content(3,"Induction heater",56,"This product is very durable nd takesless electriccity to operate.","electronic applainces"));
        content.add(new Content(4,"Pressure Cooker",15,"fan speeed","home applainces"));
        content.add(new Content(5,"T-Shirt",15,"white colour","garments"));
        content.add(new Content(6,"fan",15,"fan speeed",""));
        content.add(new Content(7,"fan",15,"fan speeed",""));
        content.add(new Content(8,"fan",15,"fan speeed",""));
        content.add(new Content(9,"fan",15,"fan speeed",""));
        content.add(new Content(10,"fan",15,"fan speeed",""));
        content.add(new Content(11,"fan",15,"fan speeed",""));

		
	
		return content;
		
		
		
	}

}
