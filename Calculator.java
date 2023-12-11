import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }
}
