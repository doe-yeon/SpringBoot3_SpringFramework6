package com.dylee.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context - 
		
		//-인스턴스 생성
		var context =
				//-설정파일 생성
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		
		//2: Configure the things that we want Spring to manage(HelloWorldConfiguration.java)
		//-HelloWorldConfiguration: @Configuration
		//-name: @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		
	}

}
 