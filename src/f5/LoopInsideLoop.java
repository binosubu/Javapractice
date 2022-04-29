package f5;

import java.util.Scanner;

public class LoopInsideLoop {
    public static void main(String[] args) {

        for (int num = 1; num <= 10; num++) {
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.print(num + "\t*\t" + i + "\t=\t" + result + "\n");
            }
            System.out.println("");
        }
    }
}
