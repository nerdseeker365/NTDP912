package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class StandardCar implements Car {
	  private Tyre tyre=null;
	public StandardCar(Tyre tyre) {
	   this.tyre=tyre;
	}

	@Override
	public void assemble() {
		System.out.println("StandardCar.assemble()");
		
	}

	@Override
	public void painiting() {
		System.out.println("StandardCar.painiting()");
	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar.roadTest()--->"+tyre.showDetails());
	}
	
	

}
