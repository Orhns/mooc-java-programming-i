
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Bir isim verin: ");
            String isim = scan.nextLine();
            liste.add(isim);
            if (isim.equals("")) {
                break;
            }
        }
        System.out.println(liste.get(2));
    }
}
