package com.jinhyeon;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// datasource에 대한 설정을 담는 클래스, 즉 DataSource의 책임이 AppConfig로 옮겨짐
// 어노테이션을 추가하여, ApplicationContext에서 관리할 대상 객체라는 것을 알린다. 
@Configuration
public class AppConfig {
	@Bean
	public DataSource dataSource() {
 		BasicDataSource dataSource = new BasicDataSource();
 		dataSource.setDriverClassName("org.h2.Driver");
 		dataSource.setUrl("jdbc:h2:~/javaweb/db;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE;");
 		dataSource.setUsername("sa");
 		dataSource.setPassword("sa");
 		return dataSource;
 	}
}