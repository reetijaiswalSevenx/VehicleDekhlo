package io.sevenx.vehicledekhlo.data;

public class Bike extends Vehicle{
	
	private String brakeType;
	private int cc;
	
	public String getBrakeType() {
		return brakeType;
	}
	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

}
