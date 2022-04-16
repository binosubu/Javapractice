package f4;

import java.util.Scanner;

public class OperationScanner {
    public static void main(String[] args) {
        int num1, num2, result;
        char operator;

        Scanner scanner = new Scanner(System.in); //defining scanner class
        System.out.print("Please enter number one: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter number two: ");
        num2 = scanner.nextInt();
        System.out.print("Please enter the operator ( +, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        if (operator == '+'){
            result = num1 + num2;
            System.out.println("\nThe sum of two numbers(" +  num1 + " + " + num2 + ") is " + result + ".");
        }
        else if (operator == '-'){
            result = num1 - num2;
            System.out.println("\nThe subtract of two numbers(" +  num1 + " - " + num2 + ") is " + result + ".");
        }
        else if (operator == '*'){
            result = num1 * num2;
            System.out.println("\nThe multiple of two numbers(" +  num1 + " * " + num2 + ") is " + result + ".");
        }
        else if (operator == '/'){
            result = num1 / num2;
            System.out.println("\nThe division of two numbers(" +  num1 + " / " + num2 + ") is " + result + ".");
        }
        else if (operator == '%'){
            result = num1 % num2;
            System.out.println("\nThe remainder of two numbers(" +  num1 + " % " + num2 + ") is " + result + ".");
        }
        else{
            System.out.println("\nInvalid Operator..");
        }
    }
}
