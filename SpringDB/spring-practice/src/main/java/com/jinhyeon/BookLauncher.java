package com.jinhyeon;

import java.util.Collections;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jinhyeon.dao.BookDao;

public class BookLauncher {

	public static void main(String[] args) {
		// db ¿¬°á¹®
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/javaweb/db;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE;");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");

		BookDao dao = new BookDao(dataSource);
		int count = dao.countBooks();
		
		System.out.println(count);
	}
}
