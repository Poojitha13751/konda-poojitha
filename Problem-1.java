import java.util.Scanner;
class Calculator {
    double a, b;
	Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
	double add() {
        return a + b;
    }
	double subtract() {
        return a - b;
    }
	double multiply() {
        return a * b;
    }
	double divide() {
        if (b != 0) return a / b;
        else {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
    }
}
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        switch (op.toLowerCase()) {
            case "add": System.out.println("Result: " + calc.add()); break;
            case "subtract": System.out.println("Result: " + calc.subtract()); break;
            case "multiply": System.out.println("Result: " + calc.multiply()); break;
            case "divide": System.out.println("Result: " + calc.divide()); break;
            default: System.out.println("Invalid operation");
        }
        sc.close();
    }
}
