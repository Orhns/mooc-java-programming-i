
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Getting the file name from user
        System.out.println("File:");
        String fileName = scan.nextLine();
        //Now I create an ArrayList of Games and called it Records.
        ArrayList<Games> Records = readRecordsFromFile(fileName);
        //And now we have all the game values inside Records ArrayList ready.
        //prompt user for team name
        System.out.println("Team:");
        String tName = scan.nextLine();
        int counter = 0;
        
        for (int i = 0; i < Records.size(); i++) {
            String line = Records.get(i).toStr();
            if (line.contains(tName)) {
                counter++;
            }
        }
        System.out.println("Games: " + counter);
        
        int wins = 0;
        int losses = 0;
        int helper = 0;
        while(helper<Records.size()){
            if (Records.get(helper).hTeam().equals(tName)) {
                int hs = Records.get(helper).hScore();
                int vs = Records.get(helper).vScore();
                if (hs>vs) {
                    wins++;
                } else {
                    losses++;
                }
           } else if (Records.get(helper).vTeam().equals(tName)) {
                int hs = Records.get(helper).hScore();
                int vs = Records.get(helper).vScore();
                if (vs>hs) {
                    wins++;
                } else {
                    losses++;
                }
            }
            helper++;
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    private static ArrayList<Games> readRecordsFromFile(String fileName) {
        ArrayList<Games> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            // every time this while block runs we get the values from file one line at a time and add this values to the games ArrayList
            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // hTeam is home team and vTeam is visiting team
            String[] parts = line.split(",");
            String hTeam = parts[0];
            String vTeam = parts[1];
            int hScore = Integer.valueOf(parts[2]);
            int vScore = Integer.valueOf(parts[3]);
            games.add(new Games(hTeam,vTeam,hScore,vScore));
            }
        } catch (Exception e) {
            Logger.getLogger("Error" + e.getMessage());
        }
        //When program flow out from try catch it returns the games Arraylist to Record Arraylist as a whole.
        return games;
    }

}
