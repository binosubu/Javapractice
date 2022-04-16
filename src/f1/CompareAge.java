package f1;

public class CompareAge {
    public static void main(String[] args) {

        int yearOne = 2019, monthOne = 8, dayOne = 14;
        int yearTwo = 2019, monthTwo = 8, dayTwo = 14;

        if (yearOne < yearTwo){
            System.out.println("Person one is older than Person two.");
        }
        else{
            if (yearOne == yearTwo){
                if (monthOne < monthTwo){
                    System.out.println("Person one is older than Person two.");
                }
                else{
                    if (monthOne == monthTwo){
                        if (dayOne < dayTwo){
                            System.out.println("Person one is older than Person two.");
                        }
                        else{
                            if (dayOne == dayTwo){
                                System.out.println("Both are same age, inorder to check who is older need to check their born time");
                            }
                            else{
                                System.out.println("Person two is older than Person one.");
                            }
                        }
                    }
                }
            }
        }
    }
}
