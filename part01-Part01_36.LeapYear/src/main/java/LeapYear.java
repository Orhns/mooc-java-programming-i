
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int yearN = Integer.valueOf(scan.nextLine());
        if ( yearN % 4 == 0 && ( yearN % 100 != 0 || yearN % 400 == 0 ) ){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
