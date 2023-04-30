
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<String> listOfNumbers = new ArrayList<>();
        
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                listOfNumbers.add(scanFile.nextLine());
            }
        }catch(Exception e){System.out.println("Error"+ e.getMessage());}
        int counter = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (lowerBound<=Integer.valueOf(listOfNumbers.get(i)) && Integer.valueOf(listOfNumbers.get(i))<=upperBound) {
                counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }

}
