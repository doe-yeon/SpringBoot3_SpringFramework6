package com.dylee.learn_spring_framework;

import com.dylee.learn_spring_framework.game.GameRunner;
import com.dylee.learn_spring_framework.game.MarioGame;
import com.dylee.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		
	}

}
