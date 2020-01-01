package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.tyre.LuxoryTyres;
import com.nt.tyre.StandardTyres;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.CarType;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.StandardCar;

public class Customer_TaxiDriver {

	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstance(CarType.MODE_STANDARD);
	}
}
