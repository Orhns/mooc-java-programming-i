import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
        System.out.print("Title: ");
        String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.parseInt(scan.nextLine());
                System.out.print("Publication year: ");
                int year = Integer.parseInt(scan.nextLine());
                bookList.add(new Book(title, pages, year));
            }
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String demand = scan.nextLine();
        
        if (demand.equals("everything")) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).toString());
            }
        }
            if (demand.equals("name")){
                for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getName());
                }
            }
    }
}
