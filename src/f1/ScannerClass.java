package f1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Please enter second number: ");
        num2 = scanner.nextDouble();

        num3 = num1 * num2;

        System.out.println("The product of two number is " + num3);

    }
}
