package com.jinhyeon;

import java.util.Collections;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.jinhyeon.dao.BookDao;
import com.jinhyeon.domain.Book;

public class BookLauncher {

	public static void main(String[] args) {
		// spring application context가 알아서 factory 설정정보 등록을 하고 bean 목록을 만든다.
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BookDao dao = context.getBean(BookDao.class);
		int count = dao.countBooks();	
		System.out.println(count);
		
		Book book = dao.selectById(1);
		System.out.println(book);
		
		context.close();
	}
}
