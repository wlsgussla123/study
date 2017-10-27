package com.jinhyeon.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jinhyeon.demo.dao.DConnectionMaker;
import com.jinhyeon.demo.dao.DaoFactory;
import com.jinhyeon.demo.dao.UserDao;
import com.jinhyeon.demo.domain.User;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Dependency Lookup을 사용할 것이기 때문에, 주입을 받지 않는다. 
		UserDao dao = new UserDao();
		
		User user2 = dao.get("1");
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + "조회 성공");
	}
}
