package f5;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        int a, b, greater;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        a = scanner.nextInt();
        System.out.print("Enter 2nd value: ");
        b = scanner.nextInt();

        greater = a > b ? a : b; //if a is greater print value of a, otherwise print b.
        System.out.println(greater + " is greater.");
    }
}
