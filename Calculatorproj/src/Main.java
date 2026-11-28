import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator CLC = new Calculator();
        int choice;

        while (true) {
        	System.out.println("-------------------------------");
            System.out.println("=======SIMPLE CALCULATOR=======");
            System.out.println("-------------------------------");
            System.out.println("1| Add two numbers             |");
            System.out.println("2| Add three numbers           |");
            System.out.println("3| Subtract                    |");
            System.out.println("4| Multiply                    |");
            System.out.println("5| Divide                      |");
            System.out.println("6| Remainder                   |");
            System.out.println("7| Power                       |");
            System.out.println("8| Square                      |");
            System.out.println("9| Show last result and count  |");
            System.out.println("0| Exit                        |");
            System.out.println("-------------------------------");
            System.out.print("Enter number of action you want to perform: ");
            choice = sc.nextInt();

 switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result: " + CLC.add(a, b));
                    break;
                case 2:
                    System.out.print("Enter three numbers: ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    int e = sc.nextInt();
                    System.out.println("Result: " + CLC.add(c,d,e));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    double f = sc.nextDouble();
                    double i = sc.nextDouble();
                    System.out.println("Result: " + CLC.subtract(f,i));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    double j = sc.nextDouble();
                    double k = sc.nextDouble();
                    System.out.println("Result: " + CLC.multiply(j,k));
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    double l = sc.nextDouble();
                    double m = sc.nextDouble();
                    if (m == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + CLC.divide(l,m));
                    }
                    break;
                case 6:
                    System.out.print("Enter two integers: ");
                    int n = sc.nextInt();
                    int o = sc.nextInt();
                    if (o == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + CLC.remainder(n,o));
                    }
                    break;
                case 7:
                    System.out.print("Enter base and exponent: ");
                    int base = sc.nextInt();
                    int exp = sc.nextInt();
                    System.out.println("Result: " + CLC.power(base, exp));
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    double p = sc.nextDouble();
                    System.out.println("Square: " + CLC.square(p));
                    break;
                case 9:
                    System.out.println("Last Result: " + CLC.getLastResult());
                    System.out.println("Operations: " + CLC.getOperationCount());
                    break;
                case 0:
                    System.out.println("Thank you for using calculator!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}