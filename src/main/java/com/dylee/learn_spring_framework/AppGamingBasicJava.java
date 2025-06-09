package com.dylee.learn_spring_framework;

import com.dylee.learn_spring_framework.game.GameRunner;
import com.dylee.learn_spring_framework.game.MarioGame;
import com.dylee.learn_spring_framework.game.PacmanGame;
import com.dylee.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
