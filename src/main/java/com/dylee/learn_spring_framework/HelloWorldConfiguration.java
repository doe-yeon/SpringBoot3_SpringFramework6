package com.dylee.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//spring 설정 클래스
@Configuration
public class HelloWorldConfiguration {
	
	// 스프링 컨테이너에게 이 메서드에서 생성한 객체를 Bean으로 등록하도록 지시
    // 아래 name() 메서드는 "Ranga"라는 문자열 객체를 생성하여 빈으로 관리함
	@Bean
	public String name() {
		return "Ranga";
	}
}
