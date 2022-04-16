package f2;

import java.util.Scanner;

public class DayClass {
    public static void main(String[] args) {
        int day;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        day = scanner.nextInt();

        if (day == 1 ){
            System.out.println("Sunday, Rest day");
        }
        else if (day == 2 ){
            System.out.println("Boring Monday");
        }
        else if (day == 3 ){
            System.out.println("Tuesday Tired day");
        }
        else if (day == 4 ){
            System.out.println("Hard work Wednesday");
        }
        else if (day == 5 ){
            System.out.println("Thursday rocking day");
        }
        else if (day == 6 ){
            System.out.println("Thank God it's Friday");
        }
        else if (day == 7 ){
            System.out.println("Fun day Saturday");
        }
        else {
            System.out.println("Invalid day input.....");
        }
    }
}
