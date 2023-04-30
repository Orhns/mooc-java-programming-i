
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {
                String[] parçala = text.split(" ");
                int helper = (parçala.length) - 1;
                System.out.println(parçala[helper]);
            }
        }

    }
}
