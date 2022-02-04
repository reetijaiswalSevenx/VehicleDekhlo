package io.sevenx.vehicledekhlo;

import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehicledekhlo.data.*;
import io.sevenx.vehicledekhlo.ui.DisplayVehicle;

public class VehicleDekhloMain {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setCompany("Renault");
		car.setModel("Duster");
		car.setBodyType("SUV");
		car.setColor("White");
		car.setBootSpace(475);
		car.setFuelType("Petrol");
		car.setFuelCapacity(50);
		car.setHorsePower(153);
		car.setMaximumTorque(254);
		car.setMileage(16);
		car.setNumberOfCylinders(4);
		car.setNumberOfGears(5);
		car.setSeatingCapacity(5);
		car.setTransmissionType("Automatic");
		
		
		Bike bike = new Bike();
		bike.setCompany("TVS");
		bike.setModel("Raider");
		bike.setBodyType("Sports");
		bike.setColor("Blue");
		bike.setFuelType("Petrol");
		bike.setFuelCapacity(10);
		bike.setCc(124);
		bike.setMaximumTorque(11);
		bike.setMileage(67);
		bike.setNumberOfCylinders(1);
		bike.setNumberOfGears(5);
		bike.setBrakeType("Disc");
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		
		
		DisplayVehicle.printVehicleInformation(list);
	}

}
