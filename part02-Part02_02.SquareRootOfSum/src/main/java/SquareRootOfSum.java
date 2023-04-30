
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        x = Integer.valueOf(scanner.nextLine());
        y = Integer.valueOf(scanner.nextLine());
        double karekok = Math.sqrt(x+y);
        System.out.println(karekok);
    }
}
