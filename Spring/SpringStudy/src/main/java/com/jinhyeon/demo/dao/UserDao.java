package com.jinhyeon.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jinhyeon.demo.domain.User;

public class UserDao {	
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "jinhyeon";
	String pwd = "****";
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(dbUrl, id, pwd);
		
		PreparedStatement pstmt = conn.prepareStatement("insert into users(id, name, password) values (?,?,?)");
		pstmt.setString(1,  user.getId());
		pstmt.setString(2,  user.getName());
		pstmt.setString(3,  user.getPassword());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		User user = new User();
		
		return user;
	}
}
