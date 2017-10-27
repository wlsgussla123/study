package com.jinhyeon.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 오브젝트를 생성하는 쪽과 생성된 오브젝트를 사용하는 쪽의 역할과 책임을 분리하기 위한 클래스. 
@Configuration // will use by application context or bean factory
public class DaoFactory {

	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
