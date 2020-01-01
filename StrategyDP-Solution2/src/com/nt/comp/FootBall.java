package com.nt.comp;

public final class FootBall implements Sport {

	public FootBall() {
		System.out.println("FootBall.0-param constructor");
	}
	
	@Override
	public String equipment() {
		return "FootBal:: football,nets,keeping gloves,vissible,yellowcard,redcard";
	}

}
