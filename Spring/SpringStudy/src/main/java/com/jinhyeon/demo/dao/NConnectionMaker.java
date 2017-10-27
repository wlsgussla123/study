package com.jinhyeon.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker {

	// makeConnection 부분을 N사에 맞게 독자적으로 확장 가능.
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		 String id = "jinhyeon";
		 String pwd = "****";
		 
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn = DriverManager.getConnection(dbUrl, id, pwd);
		 
		return conn;
	}

}
