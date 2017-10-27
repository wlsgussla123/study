package com.jinhyeon.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jinhyeon.demo.domain.User;

public class UserDao {		
	private ConnectionMaker connectionMaker;

	public UserDao() {
//		this.connectionMaker = connectionMaker;
		
		// Dependency Lookup, 스스로 Connectionmaker object를 가져오게 만들 수 있다.
		// 스스로 IoC 컨테이너인 DaoFactory에게 요청을 하고 잇음. 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);
	}
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into users(id, name, password) values (?,?,?)");
		pstmt.setString(1,  user.getId());
		pstmt.setString(2,  user.getName());
		pstmt.setString(3,  user.getPassword());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from users where id = ?");
		pstmt.setString(1,id);
		
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return user;
	}
}
