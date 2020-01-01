package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class LuxoryCar implements Car {
	 private Tyre tyre;
	public LuxoryCar(Tyre tyre) {
	   this.tyre=tyre;
	}

	@Override
	public void assemble() {
		System.out.println("LuxoryCar.assemble()");

	}

	@Override
	public void painiting() {
		System.out.println("LuxoryCar.painiting()");

	}

	@Override
	public void roadTest() {
		System.out.println("LuxoryCar.roadTest()-->"+tyre.showDetails());

	}

}
