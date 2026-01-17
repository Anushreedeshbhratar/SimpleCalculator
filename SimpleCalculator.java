
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.println("Operations: +  -  *  /");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (op) {
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
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.\n");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation. Try again.\n");
                    continue;
            }

            System.out.println("Result: " + result + "\n");

            System.out.print("Do another calculation? (y/n): ");
            char again = scanner.next().toLowerCase().charAt(0);
            if (again != 'y') {
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}

