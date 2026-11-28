package com.parkingsystem.serviceImpl;

import java.util.Scanner;

import com.parkingsystem.model.Vehicle;
import com.parkingsystem.service.Parking;

public class Parkinglot implements Parking {
	Scanner sc = new Scanner(System.in);
	private Vehicle[] arrayOfVehicle = new Vehicle[5];
	private int count = 0;
	
	private boolean vehicleadded = false;
	@Override
	public void addVehicle() {
		if(count==5) {
			System.out.println("parking is full can't add more");
			return;
		}
			Vehicle vehicle = new Vehicle();
		System.out.println("Enter Vehicle Number: ");
		vehicle.setVehicleNumber(sc.next());
		System.out.println("Enter Owner Name: ");
		vehicle.setOwnerName(sc.next());
		System.out.println("Enter Vehicle Type: ");
		vehicle.setVehicleType(sc.next());
		arrayOfVehicle[count]=vehicle;
		count++;
		System.out.println("Vehicle added Successfully");
		vehicleadded=true;
	}

	@Override
	public void displayVehicle() {
		if(vehicleadded) {
		System.out.println("The vehicles added to the Systems are: \n");
		 for(Vehicle v: arrayOfVehicle) {
			 if(v != null) {
			 System.out.println(v);}
		 }
		}else {System.out.println("Parking lot is Empty");}
	}

	@Override
	public void searchVehicle() {
		if(vehicleadded) {
	System.out.println("Enter your Vehicle Number: ");
	String num = sc.next();
	for (Vehicle vehicle : arrayOfVehicle) {
	if(vehicle != null && vehicle.getVehicleNumber().equals(num)) {
		System.out.println(vehicle);	}	
	}}else {System.out.println("Parking lot is Empty");}
	}

	@Override
	public void countVehicle() {
		if(vehicleadded) {
		System.out.println("Enter which type of vehicle you want to count: ");
		String type = sc.next();
		
		for (Vehicle vehicle : arrayOfVehicle) {
		if(vehicle != null && vehicle.getVehicleNumber().equals(type))
		{
			count++;	}
		}
		System.out.println("The count of vehicle type "+type+" is: "+count);
		}else {System.out.println("Parking lot is Empty");}
		}
		
	}




