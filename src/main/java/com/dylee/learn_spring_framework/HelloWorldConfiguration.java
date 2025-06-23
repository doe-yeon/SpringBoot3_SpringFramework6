package com.dylee.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*record: 간단한 데이터 객체를 만들기 위한 클래스타입
*name(), age() getter 생성
*toString(), equals(), hashCode() 자동 생성
*생성자도 자동 생성
*/
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};


//spring 설정 클래스
@Configuration
public class HelloWorldConfiguration {
	
	// 스프링 컨테이너에게 이 메서드에서 생성한 객체를 Bean으로 등록하도록 지시
    // 아래 name() 메서드는 "Ranga"라는 문자열 객체를 생성하여 빈으로 관리함
	@Bean
	public String name() {
		return "도연";
	}
	
	@Bean
	public int age() {
		return 32;
	}
	
	@Bean
	public Person person() {
		return new Person("효신", 45, new Address("충장로", "광주"));	
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//name, age, address2
		return new Person(name, age, address3);
	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		//name, age, address2
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		//name, age, address2
		return new Person(name, age, address);
	}
	
	@Bean(name = "Address2")
	@Primary
	public Address address() {
		return new Address("충장로", "광주");
	}
	
	@Bean(name = "Address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("충장로", "광주");
	}
	
}
