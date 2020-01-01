package com.nt.comp;

public final class VolleyBal implements Sport {

	public VolleyBal() {
		System.out.println("VolleyBal.0-param constructor");
	}
	
	@Override
	public String equipment() {
		return "VolleyBal:: bal,net ,vissile, kneepads";
	}

}
