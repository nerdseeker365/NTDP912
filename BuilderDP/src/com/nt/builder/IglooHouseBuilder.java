package com.nt.builder;

import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceCarvingInterior;
import com.nt.product.IceRoof;
import com.nt.product.IceStructure;

public class IglooHouseBuilder implements HouseBuilder {
	private  House   house;
	
	public IglooHouseBuilder() {
		System.out.println("IceHouseBuilder.0-param constructor");
		house =new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("IceHouseBuilder.buildBasement()");
		house.setBasement(new IceBasement());
	}

	@Override
	public void buildStructure() {
		System.out.println("IceHouseBuilder.buildStructure()");
		house.setStructure(new IceStructure());
	}

	@Override
	public void buildRoof() {
		System.out.println("IceHouseBuilder.buildRoof()");
		house.setRoof(new IceRoof());
	}

	@Override
	public void buildInterior() {
		System.out.println("IceHouseBuilder.buildInterior()");
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
