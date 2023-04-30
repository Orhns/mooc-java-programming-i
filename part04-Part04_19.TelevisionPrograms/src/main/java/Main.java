import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            int duration;
            if (name.isEmpty()) {
                break;
            } else {
                System.out.print("Duration: ");
                duration = Integer.parseInt(scanner.nextLine());
            }
            programs.add(new TelevisionProgram(name,duration));
        }
        
        System.out.print("Program's maximum duration? ");
        int max = scanner.nextInt();
        
        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= max) {
                System.out.println(programs.get(i).getName() + ", " + programs.get(i).getDuration() + " minutes");
            }     
        }
    }
}
