package com.exponent.bankaplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankaplication.service.RBI;
import com.exponent.bankingaplication.model.Account;

public class SBIImple implements RBI {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {
		System.out.println("Enter Your Acc No");
		int accno = sc.nextInt();
		ac.setAccNo(accno);
		System.out.println("Enter Your Name");
		ac.setName(sc.next());
		System.out.println("Enter Your Adhar Card No");
		ac.setAdharCardNo(sc.nextLong());
		System.out.println("Enter Your Pan Card No");
		ac.setPanCardNo(sc.next());
		System.out.println("Enter Your Contact No");
		ac.setContact(sc.nextLong());
		System.out.println("Enter Your Email Id");
		ac.setEmailId(sc.next());
		System.out.println("Enter Your Account opening Balance");
		;
		ac.setAccBalance(sc.nextDouble());
	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter Your Acc No");
		int enteredaccno = sc.nextInt();
		if (enteredaccno == ac.getAccNo()) {
			System.out.println(ac);

		}
	}

	@Override
	public void showAcoountBalance() {
		System.out.println("Your ACC Balance is: " + ac.getAccBalance());

	}

	@Override
	public void withdrowMoney() {
		System.out.println("Enter Amount you want to withdrow in your account");
		double withdrow = sc.nextDouble();
		if (withdrow > 500) {
			double updatedbalance = ac.getAccBalance() - withdrow;
			System.out.println("You have succefully withdrow : " + withdrow + " rs from your account");
			System.out.println("Your remaining balance is : " + updatedbalance + " rs");
			ac.setAccBalance(updatedbalance);
		} else {
			System.out.println("You shoud Withdrow amount greater than 500");
		}

	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Amount you want to Deposit in your account");
		double deposit = sc.nextDouble();
		if (deposit > 500) {
			double updatedbalance = ac.getAccBalance() + deposit;
			System.out.println("You have succefully Deposited : " + deposit + " rs from your account");
			System.out.println("Your balance is : " + updatedbalance + " rs");
			ac.setAccBalance(updatedbalance);
		} else {
			System.out.println("You shoud Deposit amount greater than 500");
		}

	}

	@Override
	public void updateAccountDetails() {
		System.out.println("Enter Your Acc No");
		int enteredaccno = sc.nextInt();
		if (enteredaccno == ac.getAccNo()) {
			System.out.println("Which field you want to Update");
			System.out.println("__________________________");
			System.out.println("|1| Name                 |");
			System.out.println("|2| Email Id             |");
			System.out.println("|3| Contact number       |");
			System.out.println("|_|______________________|");
		    System.out.println(" Please Enter your Choice ");
		    int ch =sc.nextInt();
		    switch(ch) {
		    case 1:
		    	System.out.println("Enter new name");
		    	ac.setName(sc.next());
		    	System.out.println("Name updated succesfully");
		    break;    
		    case 2:
		    	System.out.println("Enter new Email Id");
		    	ac.setEmailId(sc.next());
		    	System.out.println("Email Id updated succesfully");
		   break;
		    case 3:
		    	System.out.println("Enter new Contact No");
		    	ac.setContact(sc.nextLong());
		    	System.out.println("Contact no updated succesfully");
		    	break;
		    
		    }
		}
	}

}
