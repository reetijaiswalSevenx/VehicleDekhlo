package io.sevenx.vehicledekhlo.ui;

import java.util.List;

import io.sevenx.vehicledekhlo.data.Bike;
import io.sevenx.vehicledekhlo.data.Car;
import io.sevenx.vehicledekhlo.data.Vehicle;

public class DisplayVehicle {
	
	public static void printVehicleInformation(List<Vehicle>vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println("****************");
			System.out.println("Company: " + vehicle.getCompany());
			System.out.println("Model Name: " + vehicle.getModel());
			System.out.println("Body Type: " + vehicle.getBodyType());
			System.out.println("Color: " + vehicle.getColor());
			System.out.println("Fuel Type: " + vehicle.getFuelType());
			System.out.println("Fuel Capacity: " + vehicle.getFuelCapacity() + "L");
			System.out.println("Maximum Torque: "+ vehicle.getMaximumTorque() + "NM");
			System.out.println("Mileage: " + vehicle.getMileage() + "kmpl");
			System.out.println("Number of Gears: " + vehicle.getNumberOfGears());
			
			if(vehicle instanceof Car) {
				Car car = (Car)vehicle;
				System.out.println("Tranmission Type: " + car.getTransmissionType());
				System.out.println("Boot Space: " + car.getBootSpace());
				System.out.println("Horse Power: "+ car.getHorsePower() + "HP");
			}
			else if(vehicle instanceof Bike) {
				Bike bike = (Bike)vehicle;
				System.out.println("Displacement: " + bike.getCc() + "cc");
				System.out.println("Brake Type: " + bike.getBrakeType());
				
			}
		}
	}

}
