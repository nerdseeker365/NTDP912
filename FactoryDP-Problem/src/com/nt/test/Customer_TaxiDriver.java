package com.nt.test;

import com.nt.tyre.StandardTyres;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.StandardCar;

public class Customer_TaxiDriver {

	public static void main(String[] args) {
		Tyre tyre=null;
		Car car=null;
		tyre=new StandardTyres();
		car=new StandardCar(tyre);
		car.assemble();
		car.painiting();
		car.roadTest();
	}

}
