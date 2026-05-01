import java.util.Scanner;

public class arithmetic_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        // addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        input.close();
    }
}
