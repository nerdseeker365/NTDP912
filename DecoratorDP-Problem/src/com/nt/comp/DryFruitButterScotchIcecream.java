package com.nt.comp;

public class DryFruitButterScotchIcecream extends  ButterScotchIcecream {

	@Override
	public void prepare() {
       super.prepare();
       addToppings();
	}
	
    private  void addToppings() {
    	System.out.println("adding dryfruits");
    }
}
