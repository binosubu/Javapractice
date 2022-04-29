package f5;

import java.util.Scanner;

public class ScannerClassLoop {
    public static void main(String[] args) {

        int num1, num2;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter number 2 (should be greater than number 1): ");
        num2 = scanner.nextInt();

        for (int num = num1; num <= num2 ; num++){
//            counter++;
//            if (counter == 5 ){ // this will skip number 5 -------------
//               continue;
//            }
            for (int i = 1; i <= 10; i++){
                int result = num * i;
                System.out.print(num + "\t*\t" + i + "\t=\t" + result + "\n");
            }
            System.out.println("__________________");
            counter++;
            if (counter > 5){// this will run only 5 time (counter >5)......output will be only 5 -------
                break;
            }
        }
    }
}
