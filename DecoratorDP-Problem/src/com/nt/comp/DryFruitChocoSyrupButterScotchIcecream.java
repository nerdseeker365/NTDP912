package com.nt.comp;

public class DryFruitChocoSyrupButterScotchIcecream extends  ChocoSyrupButterScotchIcecream{

	@Override
	public void prepare() {
	 super.prepare();
	 addTopings();
	}

	private void addTopings() {
		System.out.println("adding  Dryfruit");
	}
	
}
