package protect1;

import protect2.Protector;

public class ClassA extends Protector {
	
@Override
	protected final void m1() {
	System.out.println("overrided m1 of Protector");
	System.out.println(rno + " is roll number of " + name);
	}

ClassA() {
	super();
	//rno = 1;//final variable
	//name = "Mahesh";// variable are final
	m2();
	System.out.println(rno + " is roll number of " + name);
}

	public static void main(String[] args) {
		//Protector p = new Protector();
		ClassA aa = new ClassA();
		aa.m1();
		//Protector p = new Protector();//cant creat its done by super in child constructor
		Protector p= new ClassA();
		//p.m1();//outside package not allowed
	//	p.m2(); can directly call as it is static
	}
}
