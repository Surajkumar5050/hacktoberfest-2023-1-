import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Quit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    // Implement subtraction
                    break;
                case 3:
                    // Implement multiplication
                    break;
                case 4:
                    // Implement division
                    break;
                case 5:
                    System.out.print("Enter the number for square root: ");
                    double numberForSquareRoot = scanner.nextDouble();
                    result = Math.sqrt(numberForSquareRoot);
                    break;
                case 6:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid operation.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
