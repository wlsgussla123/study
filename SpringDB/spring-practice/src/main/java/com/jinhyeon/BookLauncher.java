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
//		System.out.println(count);
		
		// select
		Book book = dao.selectById(1);
		System.out.println(book);
		
//		 insert
//		Book book2 = new Book("김용현", "한국사", 520);
//		int newId = dao.insert(book2);
//		System.out.println(newId);
//		
//		System.out.println(dao.selectById(newId));
		
		// delete
//		dao.deleteById(34);
//		System.out.println(dao.selectById(34));
		
		Book book3 = new Book(1, "박진현", "열심히", 400);
		dao.update(book3);
		
		
		context.close();
	}
}

