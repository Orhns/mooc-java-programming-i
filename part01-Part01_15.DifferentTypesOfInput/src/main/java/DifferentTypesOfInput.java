
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String metin = scan.nextLine();
        System.out.println("Give an integer:");
        int tamSayi = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatingSayi = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean dogruMu = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + metin);
        System.out.println("You gave the integer " + tamSayi);
        System.out.println("You gave the double " + floatingSayi);
        System.out.println("You gave the boolean " + dogruMu);
    }
}
