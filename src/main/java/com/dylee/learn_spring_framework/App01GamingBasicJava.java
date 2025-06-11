package com.dylee.learn_spring_framework;

import com.dylee.learn_spring_framework.game.GameRunner;
import com.dylee.learn_spring_framework.game.MarioGame;
import com.dylee.learn_spring_framework.game.PacmanGame;
import com.dylee.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();	//1: 객체 생성
		
		var gameRunner = new GameRunner(game);	//2: 객체 생성 + 의존성 주입(DI)
			//GameRunner는 game에 의존한다
		gameRunner.run();
		
	}

}
 