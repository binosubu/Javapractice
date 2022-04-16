package f1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age : ");
        age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Your name is " + name + " and you are eligible to vote.");
        }
        else{
            System.out.println("Your name is " + name + " and you are not eligible to vote.");
        }
    }
}
