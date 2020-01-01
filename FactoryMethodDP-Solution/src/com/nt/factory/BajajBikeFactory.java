package com.nt.factory;

import com.nt.bike.BajajBike;

public abstract  class BajajBikeFactory {
	private  void assemble() {
		System.out.println("BajajBikeFactory.assemble()");
	}
	
	private  void  paint() {
		System.out.println("BajajBikeFactory.paint()");
	}
	
	private  void  roadTest() {
		System.out.println("BajajBikeFactory.roadTest()");
	}
	
	private  void  packing() {
		System.out.println("BajajBikeFactory.packing()");
	}
	public  abstract  BajajBike getInstance(String type);

	  //Factory Method DP
	public   BajajBike  orderBike(String type) {
		BajajBike bike=null;
		bike=getInstance(type);
		assemble();
		paint();
		roadTest();
		packing();
		return bike;
	}



}
