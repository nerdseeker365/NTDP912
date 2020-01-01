package com.nt.factory;

import com.nt.comp.Cricket;
import com.nt.comp.Player;

public class PlayerFactory {
	
	public static   Player getInstance() {
		    Cricket cricket=null;
		    Player player=null;
		    //create Objects
		    cricket=new Cricket();
		    player=new Player();
		    player.setCricket(cricket);
		    //return object
		    return player;
	}

}
