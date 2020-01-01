package com.nt.comp;

public final class Player {
	private  Sport  sport;
	
	public Player() {
		System.out.println("Player.0-param constructor");
	}

	public void setSport(Sport sport) {
		System.out.println("Player.setSport(-)");
		this.sport=sport;
	}
	
	
	public    void  playGame() {
		String equip=null;
		//arrange equipment
		equip=sport.equipment();
		System.out.println("Playing Game using "+equip);
	}
	

}
