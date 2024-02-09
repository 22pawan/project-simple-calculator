import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();

        double sum = num1 + num2, difference = num1 - num2, product = num1 * num2;
        double quotient = num1 / num2, power = Math.pow(num1, num2);
        double max = Math.max(num1, num2), min = Math.min(num1, num2);
        double absolute = Math.abs(num1 - num2);

        System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product +
                "\nQuotient: " + quotient + "\nPower: " + power + "\nMaximum: " + max + "\nMinimum: " + min +
                "\nAbsolute difference: " + absolute);

        scanner.close();
    }
}

