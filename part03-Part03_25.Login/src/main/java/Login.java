
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String uName = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        
        if (uName.equals("alex") && pass.equals("sunshine") || uName.equals("emma") && pass.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
