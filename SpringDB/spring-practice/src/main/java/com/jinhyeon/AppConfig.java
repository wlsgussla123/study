package com.jinhyeon;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// datasource에 대한 설정을 담는 클래스, 즉 DataSource의 책임이 AppConfig로 옮겨짐
// 어노테이션을 추가하여, ApplicationContext에서 관리할 대상 객체라는 것을 알린다. 
@Configuration
@ComponentScan
@PropertySource("application.properties")
public class AppConfig {
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.username}")
	private String userName;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Bean
	public DataSource dataSource() {
 		BasicDataSource dataSource = new BasicDataSource();
 		dataSource.setDriverClassName(this.driverClassName);
 		dataSource.setUrl(this.url);
 		dataSource.setUsername(this.userName);
 		dataSource.setPassword(this.password);
 		return dataSource;
 	}
}