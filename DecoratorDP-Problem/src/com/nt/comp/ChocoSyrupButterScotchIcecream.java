package com.nt.comp;

public class ChocoSyrupButterScotchIcecream extends  ButterScotchIcecream{

	@Override
	public void prepare() {
	 super.prepare();
	 addTopings();
	}

	private void addTopings() {
		System.out.println("adding  ChocoSyrup");
	}
	
}
