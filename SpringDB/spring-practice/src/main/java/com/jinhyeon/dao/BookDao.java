package com.jinhyeon.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.jinhyeon.domain.Book;

// dao는 DB에 접속하고 쿼리를 호출하는 역할.

// Repository는 주로 DAO에 붙인다. 스프링에서 관리하는 bean으로 등록하는 것이고, context.getBean을 통해 얻을 수 있음.
@Repository
public class BookDao {
	private NamedParameterJdbcTemplate jdbc;
	private static final String COUNT_BOOK = "SELECT COUNT(*) FROM book";
	private static final String SELECT_BY_ID =
			"SELECT id, title, author, pages FROM book where id = :id";
	
	// dataSource 주입 (connection 연결 객체라고 생각하자.)
	// 파라미터 type을 DataSource로 변경(인터페이스), 이전의 DriverManagerDataSource 코드 변겨
	public BookDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public Book selectById(Integer id) {
//		RowMapper<Book> rowMapper = (rs, i) -> {
//			Book book = new Book();
//			book.setId(rs.getInt("id"));
//			book.setTitle(rs.getString("title"));
//			book.setAuthor(rs.getString("author"));
//			book.setPages((Integer) rs.getObject("pages"));
//			return book;
//		};

		RowMapper<Book> rowMapper = BeanPropertyRowMapper.newInstance(Book.class);

		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return jdbc.queryForObject(SELECT_BY_ID, params, rowMapper);
	}

	// 실제 DB 접속 쿼리
	public int countBooks() {
		Map<String, Object> params = Collections.emptyMap();
		return jdbc.queryForObject(COUNT_BOOK, params, Integer.class);
	}
}
