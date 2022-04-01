package first;

public class ComparingPersonAge {
    public static void main(String[] args) {
        int yearOne = 1998;
        int monthOne = 1;
        int dayOne = 20;
        int yearTwo = 1998;
        int monthTwo = 1;
        int dayTwo = 29;

        if (yearOne < yearTwo){
            System.out.println("Person One is older than person Two.");
        }
        else if (yearOne == yearTwo && monthOne < monthTwo){
            System.out.println("Person One is older than person Two with same year.");
        }
        else if ( yearOne == yearTwo && monthOne == monthTwo && dayOne < dayTwo){
            System.out.println("Person One is older than person Two with same year and same month.");
        }
        else if ( yearOne == yearTwo && monthOne == monthTwo && dayOne == dayTwo){
            System.out.println("Both Person are of same age. Inorder to find who is older, need to check their born time.");
        }
        else{
            System.out.println("Person Two is Older.");
        }

    }
}
