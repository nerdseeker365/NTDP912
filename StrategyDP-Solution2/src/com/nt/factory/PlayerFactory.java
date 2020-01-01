package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Player;
import com.nt.comp.Sport;

public class PlayerFactory {
	private static String sport_class;
	static {
		InputStream is=null;
		Properties props=null;
		try {
		//create InputStream pointing to properties file
		is=new FileInputStream("src/com/nt/commons/management.properties");
		//Load properties file content into java.util.Properties class object
		props=new Properties();
		props.load(is);
		sport_class=props.getProperty("player.sport");
		}
		catch(FileNotFoundException fnfe) {
		  fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static   Player getInstance() {
		    Sport sport=null;
		    Player player=null;
		    Class c=null;
		    //create Dependent class object
		    try {
		      c=Class.forName(sport_class);
		      sport=(Sport)c.newInstance();
		      //create Target class object
			    player=new Player();
			    //assign Dependent class obj to taget class object
			    player.setSport(sport);
		    }
		    catch(ClassNotFoundException cnf) {
		    	cnf.printStackTrace();
		    }
		    catch(InstantiationException ie) {
		    	ie.printStackTrace();
		    }
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
		    //return object
		    return player;
	}//method

}//class
