package first;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        /*
        int userId;
        int password;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your userID: ");
        userId = scanner.nextInt();
        System.out.print("Please enter your password: ");
        password = scanner.nextInt();

        if (userId == 123 && password == 456){
            System.out.println("Successful Login!!");
        }
        else{
            System.out.println("Invalid Login!!");
        }
         */
        String userId;
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your userID: ");
        userId = scanner.nextLine();
        System.out.print("Please enter your password: ");
        password = scanner.nextLine();

        if (userId.equals("tech") && password.equals("interacts")){
            System.out.println("Successful Login!!");
        }
        else{
            System.out.println("Invalid Login!!");
        }
    }
}
