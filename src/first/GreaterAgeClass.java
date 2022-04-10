package first;

public class GreaterAgeClass {
    public static void main(String[] args) {

        int yearOne = 2019, monthOne = 7, dayOne = 14;
        int yearTwo = 2019, monthTwo = 8, dayTwo = 14;

        if (yearOne < yearTwo){
            System.out.println("Person one is older than Person two.");
        }
        else {
            if (yearOne == yearTwo && monthOne < monthTwo ){
                System.out.println("Person one is older than Person two.");
                }
            else {
                if (yearOne == yearTwo && monthOne == monthTwo && dayOne < dayTwo){
                    System.out.println("Person one is older then Person two.");
                }
                else {
                    if (yearOne == yearTwo && monthOne == monthTwo && dayOne == dayTwo) {
                        System.out.println("Both person are of same age, need to check their birth time.");
                    }
                    else{
                        System.out.println("Person two is older than person one.");
                    }
                }
            }
        }
    }
}
