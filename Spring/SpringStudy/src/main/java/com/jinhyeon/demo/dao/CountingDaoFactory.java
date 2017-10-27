package com.jinhyeon.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 새로운 의존관계 설정 정보
@Configuration
public class CountingDaoFactory {
//	@Bean
//	public UserDao userDao() {
//		return new UserDao(connectionMaker());
//	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new CountingConnectionMaker(realConnectionMaker());
	}
	
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new DConnectionMaker();
	}
}
