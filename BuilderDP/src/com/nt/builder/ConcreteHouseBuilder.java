package com.nt.builder;

import com.nt.product.ConcreateStructure;
import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoof;
import com.nt.product.House;
import com.nt.product.WoodenAndGlassInterior;

public class ConcreteHouseBuilder implements HouseBuilder {
	private  House   house;
	
	public ConcreteHouseBuilder() {
		System.out.println("ConcreteHouseBuilder.0-param constructor");
		house =new  House();
	}

	@Override
	public void buildBasement() {
		System.out.println("ConcreteHouseBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildStructure() {
		System.out.println("ConcreteHouseBuilder.buildStructure()");
		house.setStructure(new ConcreateStructure());
	}

	@Override
	public void buildRoof() {
		System.out.println("ConcreteHouseBuilder.buildRoof()");
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void buildInterior() {
		System.out.println("ConcreteHouseBuilder.buildInterior()");
		house.setInterior(new WoodenAndGlassInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
