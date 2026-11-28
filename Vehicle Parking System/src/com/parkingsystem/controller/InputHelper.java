package com.parkingsystem.controller;

import java.util.Scanner;

import com.parkingsystem.serviceImpl.Parkinglot;

public class InputHelper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parkinglot pl = new Parkinglot();
		boolean flag = true;
		while(flag) {
			System.out.println("=====Parking System======");
			System.out.println("__________________________");
			System.out.println("|1| Add Vehicle          |");
			System.out.println("|2| Display Vehicle      |");
			System.out.println("|3| Search vehicle by No.|");
			System.out.println("|4| Count Vehicle by Type|");
			System.out.println("|5| Exit                 |");
		    System.out.println("|_|______________________|");
		    System.out.println(" Please Enter your Choice ");
		
		    int ch = sc.nextInt();
		    switch(ch) {
		    case 1:
		    	pl.addVehicle();
		    	break;
		    case 2:
		    	pl.displayVehicle();
		    	break;
		    case 3:
		    	pl.searchVehicle();
		    	break;
		    case 4:
		    	pl.countVehicle();
		    	break;
		    case 5:
		    	flag=false;
		    	break;
		    default:
		    	System.out.println("Entered Wrong Choice");	
		    break;
		    }
		 
		}
		System.out.println("===Thank you for Visiting===");
		sc.close();
	}

}
