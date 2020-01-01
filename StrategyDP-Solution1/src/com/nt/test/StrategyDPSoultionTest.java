package com.nt.test;

import com.nt.comp.Player;
import com.nt.comp.SportType;
import com.nt.factory.PlayerFactory;

public class StrategyDPSoultionTest {

	public static void main(String[] args) {
		Player player=null;
		//get Player
		player=PlayerFactory.getInstance(SportType.SPORT_TYPE_CRICKET);
		//invoke the method
		player.playGame();
	}//main
}//class
