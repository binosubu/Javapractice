package first;
import java.util.Scanner;
public class ComparingAgeScanner {
    public static void main(String[] args) {
        int yearOne,yearTwo,monthOne,monthTwo,dayOne,dayTwo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Birth Year: ");
        yearOne = scanner.nextInt();
        System.out.print("Please Enter Your Birth Month: ");
        monthOne = scanner.nextInt();
        System.out.print("Please Enter Your Birth Day: ");
        dayOne = scanner.nextInt();
        System.out.println("Your Date of Birth is " + yearOne + "/" + monthOne + "/" + dayOne + ".");

        System.out.print("\nPlease Enter Person Two Birth Year: ");
        yearTwo = scanner.nextInt();
        System.out.print("Please Enter Person Two Birth Month: ");
        monthTwo = scanner.nextInt();
        System.out.print("Please Enter Person Two Birth Day: ");
        dayTwo = scanner.nextInt();
        System.out.println("Person Two Date of Birth is " + yearTwo + "/" + monthTwo + "/" + dayTwo + ".");

        if (yearOne < yearTwo){
            System.out.println("\nYou are older than Person Two......");
        }
        else if (yearOne == yearTwo && monthOne < monthTwo){
            System.out.println("\nYou are older than Person Two......");
        }
        else if ( yearOne == yearTwo && monthOne == monthTwo && dayOne < dayTwo){
            System.out.println("\nYou are older than Person Two......");
        }
        else if ( yearOne == yearTwo && monthOne == monthTwo && dayOne == dayTwo){
            System.out.println("\nBoth Person are of same age. Inorder to find who is older, need to check their born time.");
        }
        else{
            System.out.println("\nPerson Two is older than you.");
        }
    }
}
