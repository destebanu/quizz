package Dao;

import java.util.List;

import modelo.Category;


public interface CategoryDao {
	
	int save (Category category);
	
	List<Category> show();

}
