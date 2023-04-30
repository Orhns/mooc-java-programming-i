
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int stars = 0;
        while(stars<number){
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int size) {
        int line = 1;
        int spc = (size-1);
        int str = line;
        while(line<=size){           
            printSpaces(spc);
            spc--;
            printStars(line);
            line++;
        }
    }
    public static void christmasTree(int height) {
        int line = 1;
        int spc = (height-1);
        int str = line;
        while(line<=height){           
            printSpaces(spc);
            spc--;
            printStars(str);
            str+=2;
            line++;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height-2);
            printStars(3);
        }        
    }
    public static void main(String[] args) {        
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
