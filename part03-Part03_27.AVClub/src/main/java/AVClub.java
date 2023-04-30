
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {
                String[] parçalar = text.split(" ");
                for (String parça : parçalar) {
                    if (parça.contains("av")) {
                        System.out.println(parça);
                    }
                }
            }
        }

    }
}
