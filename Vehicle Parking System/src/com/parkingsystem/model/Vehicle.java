package com.parkingsystem.model;

public class Vehicle {
	private String vehicleNumber;
	private String ownerName;
	private String vehicleType;

	public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Vehicle Number= " + vehicleNumber + ", Owner Name = "
						+ ownerName +", Vehicle Type = " + vehicleType;
	}
	

}
