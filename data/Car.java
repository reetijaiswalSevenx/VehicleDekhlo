package io.sevenx.vehicledekhlo.data;

public class Car extends Vehicle {
 
	private int seatingCapacity;
	private String transmissionType;
	private int horsePower;
	private int bootSpace;
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}
	
}
