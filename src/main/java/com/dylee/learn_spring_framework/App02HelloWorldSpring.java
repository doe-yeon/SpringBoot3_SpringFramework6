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
		// 'name'이라는 이름의 Bean 조회 → "도연" 출력
		System.out.println("name: "+context.getBean("name"));
		// 'age'라는 이름의 Bean 조회 → 32 출력
		System.out.println("age: "+context.getBean("age"));
		// 'person'이라는 이름의 Bean 조회 → new Person("효신", 45) 객체 출력
		System.out.println("person: "+context.getBean("person"));
		// 'person2MethodCall'이라는 이름의 Bean 조회 → name(), age()를 통해 생성된 Person("도연", 32) 객체 출력
		System.out.println("person2MethodCall: "+context.getBean("person2MethodCall"));
		// 'Address2'라는 이름으로 등록된 Address 객체 조회 → new Address("충장로", "광주") 객체 출력
		System.out.println("@Bean 이름 = 'Address2': "+context.getBean("Address2"));
		// Address 타입의 Bean 중 하나를 타입 기준으로 조회 → Address("충장로", "광주") 객체 출력
		System.out.println("클래스 주소 Address.class: "+context.getBean(Address.class));
		
	}

}
 