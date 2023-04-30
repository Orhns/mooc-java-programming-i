
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        x = Integer.valueOf(scanner.nextLine());
        y = Integer.valueOf(scanner.nextLine());
        if (x>y) {
            System.out.println( x + " is greater than " + y + ".");
        } else if (x<y) {
            System.out.println( x + " is smaller than " + y + ".");
        } else {
            System.out.println( x + " is equal to " + y + ".");
        }
    }
}
