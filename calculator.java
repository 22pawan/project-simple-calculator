import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        System.out.println("Enter an operator (+, -, *, /): ");
        // char operator = scanner.next().charAt(0);
        float result;
// switch (operator) {
//             case '+':
//                         result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Error! Dividing by zero is not allowed.");
//                     return;
//                 }
//                 break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
