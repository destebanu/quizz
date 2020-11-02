package modelo;

import org.springframework.context.annotation.Bean;

import Dao.CategoryDao;
import Dao.CategoryJdbc;


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

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
	

}
