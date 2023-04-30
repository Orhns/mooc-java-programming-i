
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while(true){
        int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
        numbers.add(number);  
        }
        
        int enKucuk = numbers.get(0);
        
        while(true){
        
        for (int i = 0; i < numbers.size() ; i++) {
            int value = numbers.get(i);
            if (value<enKucuk) {
                enKucuk=value;
            }
        }
        System.out.println("Smallest number: " + enKucuk);
        
            for (int i = 0; i < numbers.size(); i++) {
                int indexx= numbers.get(i);
                if (indexx == enKucuk) {
                    System.out.println("Found at index: " + i);
                }
            }
            break;
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        
    }
}
