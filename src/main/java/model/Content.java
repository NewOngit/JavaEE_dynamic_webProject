package model;

public class Content {
	private  int id;
	private String name;
	private long quantity;
	private String description;
	private String categories;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public Content(int id, String name, long quantity, String description, String categories) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", quantity=" + quantity + ", description=" + description
				+ ", categories=" + categories + "]";
	}
	
	
}
