package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.Category;

@Repository
public class CategoryJdbc implements CategoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Category category) {
		return jdbcTemplate.update("insert into quizz_results (name, category) values(?,?))",
				category.getName(), category.getCategory());
	}
	
	@Override
	public List<Category> show() {
		return jdbcTemplate.query("select * from quizz_results",(rs, rowNum) -> new Category(rs.getLong("id"), rs.getString("name"), rs.getString("category")));
	}

}
