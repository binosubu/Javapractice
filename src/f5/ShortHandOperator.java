package f5;

import java.util.Scanner;

public class ShortHandOperator {
    public static void main(String[] args) {

        int a, b, previousValueOfA;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        a = scanner.nextInt();
        System.out.print("Please enter second number: ");
        b = scanner.nextInt();
        System.out.print("Please enter the operator sign (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        previousValueOfA = a;
        if ( operator == '+'){
            a += b;
            System.out.println("The sum of two numbers " + previousValueOfA + " and " + b + " is " + a + ".");
        }
        else if ( operator == '-'){
            a -= b;
            System.out.println("The difference of two numbers " + previousValueOfA + " and " + b + " is " + a + ".");
        }
        else if ( operator == '*'){
            a *= b;
            System.out.println("The multiplication of two numbers " + previousValueOfA + " and " + b + " is " + a + ".");
        }
        else if ( operator == '/'){
            a /= b;
            System.out.println("The division of two numbers " + previousValueOfA + " and " + b + " is " + a + ".");
        }
        else if ( operator == '%'){
            a %= b;
            System.out.println("The remainder of two numbers " + previousValueOfA + " and " + b + " is " + a + ".");
        }
        else {
            System.out.println("Invalid Operator..");
        }
    }
}
