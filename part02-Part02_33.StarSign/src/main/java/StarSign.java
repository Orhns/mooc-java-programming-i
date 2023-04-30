
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- between the shapes
 
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(10);
        System.out.println("\n---");
        
    }

    public static void printStars(int number) {
        // first part of the exercise
        int stars = 0;
        while(stars<number){
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int satir = 0;
        while(satir<size){
            printStars(size);
            satir++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int satir = 0;
        while(satir<height){
            printStars(width);
            satir++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int satir = 1;
        while(satir<=size){
            printStars(satir);
            satir++;
        }
    }
    
}
