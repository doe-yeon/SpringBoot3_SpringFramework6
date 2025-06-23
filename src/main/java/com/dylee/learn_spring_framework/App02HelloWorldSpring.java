package com.dylee.learn_spring_framework;

import java.util.Arrays;

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
		// 'name'이라는 이름의 Bean을 조회 → "도연" (String 객체)
		System.out.println("'name' Bean: " + context.getBean("name"));

		// 'age'라는 이름의 Bean을 조회 → 32 (Integer 객체)
		System.out.println("'age' Bean: " + context.getBean("age"));

		// 'person'이라는 이름의 Bean을 조회 → new Person("효신", 45)
		System.out.println("'person' Bean: " + context.getBean("person"));

		// 'person2MethodCall'이라는 이름의 Bean을 조회 → new Person("도연", 32)
		System.out.println("'person2MethodCall' Bean: " + context.getBean("person2MethodCall"));
		
		// 'person3Parameters'이라는 이름의 Bean을 조회 → new Person("도연", 32)
		System.out.println("'person3Parameters' Bean: " + context.getBean("person3Parameters"));

		// 'Address2'라는 이름의 Bean을 조회 → new Address("충장로", "광주")
		System.out.println("'Address2' Bean: " + context.getBean("Address2"));

		// Address 타입의 Bean을 타입 기준으로 조회 → new Address("충장로", "광주")
		// (동일한 타입의 Bean이 하나만 등록된 경우에만 가능)
		System.out.println("Address Bean (by type): " + context.getBean(Person.class));
	
		System.out.println("Address Bean (by type): " + context.getBean(Address.class));
		
		
		
		
		//System.out.println
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
 