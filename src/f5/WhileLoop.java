package f5;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println("The number is " + i);
            i++;
        }
        System.out.println("------DO WHILE LOOP --------");

        int j =11;
        do{
            System.out.println(j); // this will print at least onetime, even if the code is wrong
            j++;
        }
        while(j <= 10);
    }
}
