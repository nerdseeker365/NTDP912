package com.nt.test;

import com.nt.tyre.LuxoryTyres;
import com.nt.tyre.StandardTyres;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.StandardCar;

public class Customer_RichPerson {

	public static void main(String[] args) {
		Tyre tyre=null;
		Car car=null;
		tyre=new LuxoryTyres();
		car=new LuxoryCar(tyre);
		car.assemble();
		car.painiting();
		car.roadTest();
	}

}
