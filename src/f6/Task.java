package f6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        boolean userFound = false;

        String [] names = {"Binod", "Ram", "Shyam", "Hari", "Biren", "Ishwor", "Shiva", "Anil", "Uttam", "Amit"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name: ");
        String userInput = scanner.nextLine();

        for(int i = 0; i < 10; i++){
            if(userInput.equalsIgnoreCase(names[i])){
                userFound = true;
                break;
            }
        }
        if(userFound){
            System.out.println("User Found !!");
        }
        else{
            System.out.println("User not Found!!!");
        }
    }
}
