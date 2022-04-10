package third;

import java.util.Scanner;

public class GreaterThanEqual {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Ram age: ");
        age = scanner.nextInt();

        if (age >= 110){
            System.out.println("Ram is " + age + " years and he is no more in this world.");
        }
        else if (age >= 91){
            System.out.println("Ram is " + age + " years and he is ready to go to heaven.");
        }
        else if (age >= 71) {
            System.out.println("Ram is " + age + " years and he is a very old person.");
        }
        else if (age >= 56){
            System.out.println("Ram is " + age + " years and he is an old person.");
        }
        else if (age >= 36){
            System.out.println("Ram is " + age + " years and he is a matured person.");
        }
        else if (age >= 20){
            System.out.println("Ram is " + age + " years and he is an adult person.");
        }
        else if (age >= 13){
            System.out.println("Ram is " + age + " years and he is in his teenage.");
        }
        else if (age >= 6){
            System.out.println("Ram is " + age + " years old and he is a child.");
        }
        else if (age >= 0){
            System.out.println("Ram is " + age + " years old and he is just a baby.");
        }
        else{
            System.out.println("Ram is on the process of birth.");
        }
    }
}
