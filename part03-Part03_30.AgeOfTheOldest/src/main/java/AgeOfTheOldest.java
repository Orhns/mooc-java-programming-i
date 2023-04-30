
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] parts = input.split(",");
                int x = Integer.valueOf(parts[1]);
                if (x > oldest) {
                    oldest = x;
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
