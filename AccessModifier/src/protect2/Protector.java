package protect2;

public class Protector {
	protected final static int rno;
	protected  final static String name;

	static {
	rno=25;
	name="mahesh";
	}
	
	protected void m1() {
		System.out.println("protected m1 of Protector");
		System.out.println(rno + " is roll number of " + name);
	}

	protected static void m2() {
		System.out.println("protected static m2 of Protector");
		System.out.println(rno + " is roll number of " + name);
	}

	protected Protector() {
		//rno = 2;
		//name = "Mahendra";
		System.out.println(rno + " is roll number of " + name);
		System.out.println("prot constr of ClassA");
	}
}
