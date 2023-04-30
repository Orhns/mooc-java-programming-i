
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xTimes = 0;
        int sum = 0;
        double average = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0 && xTimes>0) {
                break;
            } else if(number!=0) {
                xTimes = xTimes + 1 ;
                sum = sum + number ;
                average = 1.0*sum/xTimes;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
