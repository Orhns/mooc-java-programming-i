
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("First name: ");
            String fName = scanner.nextLine();
            String lName;
            String ID;
            
            if (fName.equals("")) {
                break;
            } else {
                System.out.print("Last name: ");
                lName = scanner.nextLine();
                System.out.print("Identification number: ");
                ID = scanner.nextLine();
            }
            infoCollection.add(new PersonalInformation(fName,lName,ID));
        }
        
        System.out.println("");
        
        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
//        for (PersonalInformation info: infoCollection) {
//            System.out.println(info.getFirstName() + " " + info.getLastName());
//        }
        
        
    }
}
