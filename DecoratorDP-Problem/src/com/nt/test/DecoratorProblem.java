package com.nt.test;

import com.nt.comp.ChocoSyrupButterScotchIcecream;
import com.nt.comp.DryFruitButterScotchIcecream;
import com.nt.comp.DryFruitChocoSyrupButterScotchIcecream;
import com.nt.comp.Icecream;
import com.nt.comp.VanilaIcecream;

public class DecoratorProblem {
	public static void main(String[] args) {
		Icecream icecream1=null,icecream2=null,icecream3=null;
		icecream1=new VanilaIcecream();
		icecream1.prepare();
		System.out.println("------------------------------");
		icecream2=new DryFruitButterScotchIcecream();
		icecream2.prepare();
		System.out.println("...................................");
		icecream3=new DryFruitChocoSyrupButterScotchIcecream();
		icecream3.prepare();
	}
	
}
