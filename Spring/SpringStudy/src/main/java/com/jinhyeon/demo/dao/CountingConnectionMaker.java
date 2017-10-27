package com.jinhyeon.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;

// DB가 몇 번 connection 되는지 counting 하기위한 클래스. (DaoFactory에서 dao를 생성할 때 마다 count 해주면 되잖아? -> dao가 100개라면 100번 쓰고 지울 것인가?)
// CountingConnectionMaker는 자신의 관심사인 DB 연결횟수 카운팅에만 초점을 맞추고 있다.
public class CountingConnectionMaker implements ConnectionMaker {
	int count = 0;
	private ConnectionMaker realConnectionMaker;

	public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
		// TODO Auto-generated constructor stub
		this.realConnectionMaker = realConnectionMaker;
	}
	
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		this.count++;
		return this.realConnectionMaker.makeConnection(); // 실제 DB connection은 주입받은 ConnectionMaker의 makeConnection을 호출
	}

	public int getCounter() {
		return this.count;
	}
}
