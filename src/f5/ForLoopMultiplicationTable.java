package f5;

import java.util.Scanner;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {

        int num;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Multiplication table of : ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.print(num + "\t*\t" + i + "\t=\t" + result + "\n");
        }
    }
}
