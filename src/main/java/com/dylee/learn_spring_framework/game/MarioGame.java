package com.dylee.learn_spring_framework.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go in to a hole");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}
