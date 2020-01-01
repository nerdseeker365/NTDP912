package com.nt.factory;

import com.nt.tyre.LuxoryTyres;
import com.nt.tyre.SportsTyres;
import com.nt.tyre.StandardTyres;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.CarType;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.SportsCar;
import com.nt.vehicle.StandardCar;

public class CarFactory {
	
	public static  Car  getInstance(String type) throws IllegalArgumentException{
		Car car=null;
		Tyre tyre=null;
		if(type.equalsIgnoreCase(CarType.MODE_STANDARD)) {
			tyre=new StandardTyres();
			car=new StandardCar(tyre);
		}
		else if(type.equalsIgnoreCase(CarType.MODE_LUXORY)) {
			tyre=new LuxoryTyres();
			car=new LuxoryCar(tyre);
		}
		else  if(type.equalsIgnoreCase(CarType.MODE_SPORTS)) { 
			tyre=new SportsTyres();
			car=new SportsCar(tyre);
		}
		else {
			throw new IllegalArgumentException("Invalid car type");
		}
		car.assemble();
		car.painiting();
		car.roadTest();
		return car;
	}
}
