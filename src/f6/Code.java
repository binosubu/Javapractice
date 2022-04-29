package f6;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        int foundIndex = 0;
        boolean namefound = false;
        boolean namePassSeek = false;
        boolean namePassFound = false;
        boolean profileFound = false;

        String name, password;
        Scanner scan = new Scanner(System.in);

        String names[] = new String[10];
        names[0] = "Yiwei";
        names[1] = "George";
        names[2] = "Mai";
        names[3] = "Reva";
        names[4] = "Megan";
        names[5] = "Salma";
        names[6] = "Karen";
        names[7] = "Shinta";
        names[8] = "Nabeen";
        names[9] = "Angela";

        String namePass[][] = new String[7][2];
        namePass[0][0] = "Yiwei";
        namePass[0][1] = "yiwei0";
        namePass[1][0] = "George";
        namePass[1][1] = "george1";
        namePass[2][0] = "Mai";
        namePass[2][1] = "mai2";
        namePass[3][0] = "Reva";
        namePass[3][1] = "reva3";
        namePass[4][0] = "Megan";
        namePass[4][1] = "megan4";
        namePass[5][0] = "Salma";
        namePass[5][1] = "salma5";
        namePass[6][0] = "Angela";
        namePass[6][1] = "angela6";


        String nameDetail[][] = new String[5][5];
        nameDetail[0][0] = "Yiwei";
        nameDetail[0][1] = "U.S";
        nameDetail[0][2] = "556644889975";
        nameDetail[0][3] = "yiwei@gmail.com";
        nameDetail[0][4] = "male";
        nameDetail[1][0] = "George";
        nameDetail[1][1] = "Nepal";
        nameDetail[1][2] = "255155555";
        nameDetail[1][3] = "george@gmail.com";
        nameDetail[1][4] = "Male";
        nameDetail[2][0] = "Mai";
        nameDetail[2][1] = "India";
        nameDetail[2][2] = "326562652";
        nameDetail[2][3] = "mai@hotmail.com";
        nameDetail[2][4] = "Female";
        nameDetail[3][0] = "Salma";
        nameDetail[3][1] = "Nepal";
        nameDetail[3][2] = "54651545";
        nameDetail[3][3] = "salma@yahoo.com";
        nameDetail[3][4] = "Female";
        nameDetail[4][0] = "Angela";
        nameDetail[4][1] = "U.S";
        nameDetail[4][2] = "265665656";
        nameDetail[4][3] = "angle@yahoo.com";
        nameDetail[4][4] = "Female";

        System.out.print("Enter the name : ");
        name = scan.nextLine();

        for ( int i = 0; i < 10; i++) {

            if ( names[i].equals(name)) {
                namefound = true;
                break;
            }
        }
        for(int k = 0; k < 7; k++) {
            if(namePass[k][0].equals(name))
                namePassSeek = true;
        }

        if (namefound) {
            if(namePassSeek) {
                System.out.print("Enter Password :");
                password = scan.nextLine();

                for( int j = 0; j < namePass.length; j++) {
                    if(password.equals(namePass[j][1])) {
                        namePassFound = true;
                    }
                }
            }
        }else
            System.out.println("User not register");

        if(namePassFound) {
            for(int l = 0; l < 5; l++) {
                if(nameDetail[l][0].equals(name)) {
                    profileFound = true;
                    foundIndex = l;
                }
            }
        }else
            System.out.println("User not activated");

        if(profileFound) {

            System.out.println("\nUser Details \n"  +
                    "\nName\t:\t" + nameDetail[foundIndex][0] +

                    "\nAddress\t\t:\t" + nameDetail[foundIndex][1] +
                    "\nPhone\t\t:\t"+nameDetail[foundIndex][2] +
                    "\nEmail\t\t:\t"+nameDetail[foundIndex][3] +
                    "\nGender\t\t:\t"+nameDetail[foundIndex][4]);
        }else
            System.out.println("User have no details");

    }
}