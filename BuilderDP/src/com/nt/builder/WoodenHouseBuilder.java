package com.nt.builder;

import com.nt.product.ConcreateStructure;
import com.nt.product.ConcreteBasement;
import com.nt.product.WoodenRoof;
import com.nt.product.House;
import com.nt.product.WoodenAndGlassInterior;

public class WoodenHouseBuilder implements HouseBuilder {
	private  House   house;
	
	public WoodenHouseBuilder() {
		System.out.println("WoodenHouseBuilder.1-param constructor");
		house = new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("WoodenHouseBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildStructure() {
		System.out.println("WoodenHouseBuilder.buildStructure()");
		house.setStructure(new ConcreateStructure());
	}

	@Override
	public void buildRoof() {
		System.out.println("WoodenHouseBuilder.buildRoof()");
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void buildInterior() {
		System.out.println("WoodenHouseBuilder.buildInterior()");
		house.setInterior(new WoodenAndGlassInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
