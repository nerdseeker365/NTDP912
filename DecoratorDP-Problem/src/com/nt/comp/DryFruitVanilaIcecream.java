package com.nt.comp;

public class DryFruitVanilaIcecream extends VanilaIcecream{

	@Override
	public void prepare() {
	   super.prepare();
	 addTopings();
	}
	
	private  void  addTopings() {
		System.out.println("add Dryfruits");
	}

}
