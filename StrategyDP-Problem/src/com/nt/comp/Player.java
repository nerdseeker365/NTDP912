package com.nt.comp;

public class Player {
	private Cricket cricket;

	public void setCricket(Cricket cricket) {
		this.cricket = cricket;
	}
	
	
	public    void  playGame() {
		String equip=null;
		//arrange equipment
		equip=cricket.equipment();
		System.out.println("Playing Game using "+equip);
	}
	

}
