package com.nt.comp;

public class DryFruitChocoSyrupVanilaIcecream extends  ChocoSyrupVanilaIcecream {

	@Override
	public void prepare() {
	 super.prepare();
	 addTopings();
	}

	private void addTopings() {
		System.out.println("adding  Dryfruits");
	}
	
}
