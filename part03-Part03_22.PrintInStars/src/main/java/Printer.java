
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int counter = 0;
        while(counter<array.length){
            int x = array[counter];
            printStars(x);
            System.out.println("");
            counter++;
        }
    }
    
    public static void printStars(int x) {
    
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        
    }

}
