package f5;

public class Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){ // increment number by 1
            System.out.println( i + ". My name is Binod Maharjan and I am from Colorado.");
        }
/*
        for (int j = 5; j > 0; j--){ // decrement number value by 1
            System.out.println( j + ". My name is Binod Maharjan and I am from Colorado.");
        }
*/
        int a = 1;
        for (int j = 5; j > 0; j--){ // using counter value
            System.out.println( a + ". My name is Binod Maharjan and I am from Colorado.");
            a++;
        }
    }
}

