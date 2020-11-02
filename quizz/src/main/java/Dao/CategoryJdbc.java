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
		return jdbcTemplate.update("insert into quizz_results (name_quizz_results, category_quizz_results) values(?,?)",
				category.getName(), category.getCategory());
	}
	
	@Override
	public List<Category> show() {
		return jdbcTemplate.query("select * from quizz_results order by id_quizz_results desc limit 5",(rs, rowNum) -> new Category(rs.getLong("id_quizz_results"),
				rs.getString("name_quizz_results"), rs.getString("category_quizz_results")));
	}
	
	@Override
	public int deleteAll() {
		return jdbcTemplate.update("delete from quizz_results");
	}


}
