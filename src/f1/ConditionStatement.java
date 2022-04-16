package f1;

import java.util.Scanner;

public class ConditionStatement {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for vote.");
        }
        else{
            System.out.println("Sorry, you are too young for vote.");
        }
    }
}
