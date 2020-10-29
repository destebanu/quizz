package modelo;

public class Category {
	private long id;
	private String name;
	private String category;
	
		
	public Category() {
		super();
	}
	
	public Category(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	
	public Category(long id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
