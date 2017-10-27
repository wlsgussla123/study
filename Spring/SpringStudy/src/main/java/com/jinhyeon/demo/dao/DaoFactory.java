package com.jinhyeon.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 오브젝트를 생성하는 쪽과 생성된 오브젝트를 사용하는 쪽의 역할과 책임을 분리하기 위한 클래스. 
@Configuration // will use by application context or bean factory
public class DaoFactory {
	@Bean // 오브젝트 생성을 담당하는 IoC용 메소드
	public UserDao userDao() {
		ConnectionMaker connectionMaker = connectionMaker(); // 팩토리 메서드는 UserDao 타입의 오브젝트를 어떻게 만들고, 준비시킬지를 결정.
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
	
	// connectionMaker 부분을 userDao에서 직접 선언하는 것이 아니라, 따로 메서드로 분리한다면 또 다시 확장에 용이해지는 것이다.
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}