
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int sum = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number>0) {
                positiveCount = positiveCount + 1;
                sum = sum + number;
            } 
        }
        if (positiveCount>0) {
            System.out.println(1.0*sum/positiveCount); 
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
