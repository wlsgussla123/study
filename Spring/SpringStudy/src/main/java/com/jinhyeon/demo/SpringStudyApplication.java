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
//		SpringApplication.run(SpringStudyApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class); // 두 번째는 리턴타입.
		
		User user = new User();
//		user.setId("3");
//		user.setName("김재섭");
//		user.setPassword("1111");
//		
//		dao.add(user);
		
//		System.out.println(user.getId() + "등록 성공");
		
		User user2 = dao.get("3");
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + "조회 성공");
	}
}
