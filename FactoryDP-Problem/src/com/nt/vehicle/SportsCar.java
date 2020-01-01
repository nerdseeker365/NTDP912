package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class SportsCar implements Car {
	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
	    this.tyre=tyre;
	}

	@Override
	public void assemble() {
		System.out.println("SportsCar.assemble()");

	}

	@Override
	public void painiting() {
		System.out.println("SportsCar.painiting()");

	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar.roadTest()--->"+tyre.showDetails());
	}

}
