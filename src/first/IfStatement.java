package first;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter person one age: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter person two age: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("Person one is older than person two.");
        }
        else if (num1 == num2){
            System.out.println("Person one and person two are of same age.");
        }
        else{
            System.out.println("Person two is older than person one.");
        }
    }
}
