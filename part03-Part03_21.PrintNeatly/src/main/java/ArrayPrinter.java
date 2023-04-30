
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int counter = 0;
        while(true){
            if (counter<(array.length-1)) {
                System.out.print(array[counter] + ", ");
            } else if (counter==(array.length-1)) {
                System.out.print(array[counter]);
                break;
            }
            counter++;
        }
    }
}
