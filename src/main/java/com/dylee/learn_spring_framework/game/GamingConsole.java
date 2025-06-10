package com.dylee.learn_spring_framework.game;

/**
 * 게임 실행기(GameRunner)와 다양한 게임 구현체 간의 결합도를 낮추기 위한 인터페이스입니다.
 * 
 * 이 인터페이스를 구현하는 클래스들은 up(), down(), left(), right() 메서드를 통해
 * 게임 조작 기능을 구현해야 합니다.
 * 
 * 인터페이스 도입으로 인해 게임 실행기는 특정 게임 클래스에 직접 의존하지 않고,
 * 느슨한 결합 구조를 갖게 되어 유지보수와 확장성이 좋아집니다.
 */
public interface GamingConsole {
	void up();
	void down();
	void left();
	void right();
	
}
