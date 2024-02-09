import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double square = num * num;
        System.out.println("Square of " + num + " is: " + square);

        double cube = Math.pow(num, 3);
        System.out.println("Cube of " + num + " is: " + cube);

        System.out.print("Enter a divisor for modulus operation: ");
        double divisor = scanner.nextDouble();
        
        double modulus = num % divisor;
        System.out.println("Modulus of " + num + " and " + divisor + " is: " + modulus);

        System.out.print("Enter an exponent for power operation: ");
        double exponent = scanner.nextDouble();

        double power = Math.pow(num, exponent);
        System.out.println(num + " raised to the power of " + exponent + " is: " + power);

        scanner.close();
    }
}