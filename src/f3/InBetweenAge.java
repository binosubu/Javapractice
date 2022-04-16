package f3;

import java.util.Scanner;

public class InBetweenAge {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Ram age: ");
        age = scanner.nextInt();

        if (age >= 0 && age <= 5){
            System.out.println("Ram is " + age + " years and he is just a baby.");
        }
        else if (age >= 6 && age <= 12){
            System.out.println("Ram is " + age + " years and he is a child.");
        }
        else if (age >= 13 && age <= 19){
            System.out.println("Ram is " + age + " years and he is in his teenage.");
        }
        else if (age >= 20 && age <= 35){
            System.out.println("Ram is " + age + " years and he is an adult person.");
        }
        else if (age >= 36 && age <= 55){
            System.out.println("Ram is " + age + " years and he is a matured person.");
        }
        else if (age >= 56 && age <= 70){
            System.out.println("Ram is " + age + " years and he is an old person.");
        }
        else if (age >= 71 && age <= 90){
            System.out.println("Ram is " + age + " years and he is a very old person.");
        }
        else if (age >= 91 && age <= 110){
            System.out.println("Ram is " + age + " years and he is ready to go to heaven.");
        }
        else{
            System.out.println("Ram is " + age + " years and he is no more in this world.");
        }

    }
}
