package f6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {

        String userInput, userPassword;
        boolean nameFound = false;
        boolean namePassCheck = false;
        boolean namePassFound = false;
        boolean profileFound = false;
        int profileIndex = 0;

        String[] names = new String[10];
        names [0] = "Binod";
        names [1] = "Ram";
        names [2] = "Subu";
        names [3] = "Hari";
        names [4] = "Biren";
        names [5] = "Ishwor";
        names [6] = "Shiva";
        names [7] = "Anil";
        names [8] = "Uttam";
        names [9] = "Amit";

        String[][] namePasses = new String[7][2];
        namePasses [0][0] = "Binod";
        namePasses [0][1] = "Binod1";
        namePasses [1][0] = "Ram";
        namePasses [1][1] = "Ram1";
        namePasses [2][0] = "Subu";
        namePasses [2][1] = "Subu1";
        namePasses [3][0] = "Hari";
        namePasses [3][1] = "Hari1";
        namePasses [4][0] = "Biren";
        namePasses [4][1] = "Biren1";
        namePasses [5][0] = "Ishwor";
        namePasses [5][1] = "Ishwor1";
        namePasses [6][0] = "Amit";
        namePasses [6][1] = "Amit1";

        String[][] nameDetails = new String [5][5];
        nameDetails [0][0] = "Binod";
        nameDetails [0][1] = "Colorado";
        nameDetails [0][2] = "999-999-9999";
        nameDetails [0][3] = "Binod@binod.com";
        nameDetails [0][4] = "male";
        nameDetails [1][0] = "Biren";
        nameDetails [1][1] = "Patan";
        nameDetails [1][2] = "888-888-8888";
        nameDetails [1][3] = "Biren@biren.com";
        nameDetails [1][4] = "male";
        nameDetails [2][0] = "Subu";
        nameDetails [2][1] = "Northglenn";
        nameDetails [2][2] = "777-777-7777";
        nameDetails [2][3] = "Subu@subu.com";
        nameDetails [2][4] = "female";
        nameDetails [3][0] = "Hari";
        nameDetails [3][1] = "Texas";
        nameDetails [3][2] = "666-666-6666";
        nameDetails [3][3] = "hari@hari.com";
        nameDetails [3][4] = "male";
        nameDetails [4][0] = "Ram";
        nameDetails [4][1] = "California";
        nameDetails [4][2] = "111-111-1111";
        nameDetails [4][3] = "Ram@ram.com";
        nameDetails [4][4] = "male";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        userInput = scanner.nextLine();

        for(int i = 0; i < 10; i++) {
            if (userInput.equalsIgnoreCase(names[i])) {
                nameFound = true;
                break;
            }
        }
        if(nameFound){
            System.out.println("User Found!!!");
        }
        else{
            System.out.println("User not Found!!!");
        }

        for(int j = 0; j < 7; j++){
            if(userInput.equals(namePasses[j][0])){
                namePassCheck= true;
                break;
            }
        }
        if(namePassCheck){
            System.out.print("Enter Password:");
            userPassword = scanner.nextLine();

            for(int k = 0; k < 7; k++){
                if(userPassword.equals(namePasses[k][1])){
                    namePassFound = true;
                    break;
                }
            }
            if(!namePassFound){
                System.out.println("User not Registered!!!");
            }
        }

        if(namePassFound){
            for(int l = 0; l < 5; l++){
                if(userInput.equals(nameDetails[l][0])){
                    profileFound = true;
                    profileIndex = l;
                    break;
                }
            }
            if(!profileFound){
                System.out.println("User not Activated!!!");
            }
        }

        if(profileFound){

            System.out.println("\nUser Details:\n" +
                    "\nName\t\t:\t" + nameDetails[profileIndex][0] +
                    "\nAddress\t\t:\t" + nameDetails[profileIndex][1] +
                    "\nPhone\t\t:\t" + nameDetails[profileIndex][2] +
                    "\nEmail\t\t:\t" + nameDetails[profileIndex][3] +
                    "\nGender\t\t:\t" + nameDetails[profileIndex][4]);
        }
    }
}
