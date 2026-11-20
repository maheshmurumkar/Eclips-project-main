
public class AllBlock {

	static {
		System.out.println("static block");
	

	}
	
	AllBlock(){
		System.out.println("default constructor");
	}
	
	{
		System.out.println("non static block");
	}
	
	public void m1() {
		System.out.println("method block");
	

	}
	
	public static void main(String[] args) {
		System.out.println("main block");
	AllBlock ab = new AllBlock();
	ab.m1(); 
	}

}
