
import java.util.ArrayList;

public class IoobProgram {

    public static void main(String[] args) {
        // Modify this program to cause an indexOutOfBoundsException 

        ArrayList<String> lines = new ArrayList<>();
        lines.add("ssss");
        lines.add("ssss");
        lines.add("ssssss");
        lines.add("sss");
        lines.add("ssss");
        lines.add("sss");

        for (String line : lines) {
            System.out.println(lines.get(15));
        }

    }
}
