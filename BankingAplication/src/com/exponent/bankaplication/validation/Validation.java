package com.exponent.bankaplication.validation;

import java.util.Scanner;

public class Validation {
	
	public static long accNum() {
		long accNum= (long)(Math.random() * Math.pow(10,12));
		return accNum;
		
	}
	
	public static long contNum() {
		Scanner sc = new Scanner(System.in);
		long contNum= sc.nextLong();
		if(contNum>6000000000l && contNum<10000000000l) {
			return contNum;
		}
		else {
			System.out.println("please enter correct 10 digit Contact num");
		}
		return contNum();
		
	}
	
	public static long adharNum() {
		Scanner sc = new Scanner(System.in);
		long adNum=sc.nextLong();
		if(adNum>100000000000l && adNum<1000000000000l) {
			return adNum;
		}
		else {
			System.out.println("please enter correct 12 digit Adhar num");
		}
		return adharNum();
	}
	
}
