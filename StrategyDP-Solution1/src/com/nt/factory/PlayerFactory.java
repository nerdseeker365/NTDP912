package com.nt.factory;

import com.nt.comp.Batmindon;
import com.nt.comp.Cricket;
import com.nt.comp.Kabaddi;
import com.nt.comp.Player;
import com.nt.comp.Sport;
import com.nt.comp.SportType;
import com.nt.comp.VolleyBal;

public class PlayerFactory {
	
	public static   Player getInstance(String type) {
		    Sport sport=null;
		    Player player=null;
		    //create one Dependent class obj based on the type..
		    if(type.equalsIgnoreCase(SportType.SPORT_TYPE_CRICKET)) {
		    	sport=new Cricket();
		    }
		    else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_KABADDI)) {
		    	sport=new Kabaddi();
		    }
		    else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_BATMINDON)) {
		    	sport=new Batmindon();
		    }
		    else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_VOLLEYBAL)) {
		    	sport=new VolleyBal();
		    }
		    else
		    	throw new IllegalArgumentException("invlid Sport type");
		    //create Target class object
		    player=new Player();
		    player.setSport(sport);
		    //return object
		    return player;
	}//method

}//class
