
public class Calculator {
	
	private double lastResult;
    private int operationCount;

 public Calculator() {
	        this.lastResult = 0;
	        this.operationCount = 0;
	    }
 public int add(int a, int b) {
	        int result = a + b;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
 public double add(double a, double b) {
	        double result = a + b;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
 public int add(int a, int b, int c) {
	        int result = a + b + c;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
 public double subtract(double a, double b) {
	        double result = a - b;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
public double multiply(double a, double b) {
	        double result = a * b;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
 public double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Cannot divide by zero");
	            return lastResult;
	        }
            double result = a / b;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
public int remainder(int a, int b) {
	        if (b == 0) {
	            System.out.println("Cannot divide by zero");
	            return (int) lastResult;
	        }
            int result = a % b;
	        lastResult = result;
	        operationCount++;
	        return result;
        }
public int power(int base, int exponent) {
	        if (exponent < 0) {
	            System.out.println("Exponent must be zero or more");
	            return 0;
	        }
	        int result = 1;
	        for (int i = 1; i<= exponent; i++) {
	            result = result*base;
	        }
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
public double square(double a) {
	        double result = a * a;
	        lastResult = result;
	        operationCount++;
	        return result;
	    }
public double getLastResult() {
	        return lastResult;
	    }
public int getOperationCount() {
	        return operationCount;
	    }
	
}
