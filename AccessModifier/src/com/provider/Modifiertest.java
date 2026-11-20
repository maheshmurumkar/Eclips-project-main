package com.provider;

public class Modifiertest {
	
	int mark = 100;
	char grade = 'a';
	
	public static void main(String[] args) {
		Modifiertest mf = new Modifiertest();
		System.out.println(mf.mark +" "+ mf.grade);
		defaultmod mf2 = new defaultmod();
		System.out.println(mf2.f+" " +mf2.d);
	}

}
