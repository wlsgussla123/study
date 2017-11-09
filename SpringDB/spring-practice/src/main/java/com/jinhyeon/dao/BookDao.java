package com.jinhyeon.dao;

import java.util.Collections;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// dao는 DB에 접속하고 쿼리를 호출하는 역할.
public class BookDao {
	private NamedParameterJdbcTemplate jdbc;
	private static final String COUNT_BOOK = "SELECT COUNT(*) FROM book";
	
	// dataSource 주입 (connection pool로부터 받아야 jdbc를 사용하지)
	public BookDao(DriverManagerDataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	// 실제 DB 접속 쿼리
	public int countBooks() {
		Map<String, Object> params = Collections.emptyMap();
		return jdbc.queryForObject(COUNT_BOOK, params, Integer.class);
	}
}
