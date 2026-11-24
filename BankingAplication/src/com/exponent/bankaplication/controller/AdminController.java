package com.exponent.bankaplication.controller;

import java.util.Scanner;

import com.exponent.bankaplication.service.RBI;
import com.exponent.bankaplication.serviceimpl.SBIImple;

public class AdminController {

	public static void main(String[] args) {
		
		System.out.println("==WELCOME TO STATE BANK OF INDIA==");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBIImple();
		
		while(flag) {
		System.out.println("--------------------------");
		System.out.println("__________________________");
		System.out.println("|1| Create Acoount       |");
		System.out.println("|2| Show Acc Details     |");
		System.out.println("|3| Show Acc Balance     |");
		System.out.println("|4| Withdrow Money       |");
		System.out.println("|5| Deposit Money        |");
	    System.out.println("|6| Update Acc Details   |");
	    System.out.println("|7| Exit                 |");
	    System.out.println("|_|______________________|");
	    System.out.println(" Please Enter your Choice ");
	    int ch =sc.nextInt();
	    
	    switch(ch) {
	    case 1:
	    	rbi.createAccount();
	    	break;
	    case 2:
	    	rbi.showAccountDetails();
	    	break;
	    case 3:
	    	rbi.showAcoountBalance();
	    	break;
	    case 4:
	    	rbi.withdrowMoney();
	    	break;
	    case 5:
	    	rbi.depositMoney();
	    	break;
	    case 6:
	    	rbi.updateAccountDetails();
	    	break;
	    case 7:
	    	flag=false;
	    	break;
	    default:
	    	System.out.println("Entered Wrong choice, Enter bet 1 to 7");	
	    break;
	    }
		}
	    System.out.println("Thank you for Banking with SBI");
	    sc.close();
		
		}		
		

	}


