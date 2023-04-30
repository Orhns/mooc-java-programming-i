
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        while(true){
        String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            int x = Integer.valueOf(parts[1]);
            if (x>age) {
                age = x;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
