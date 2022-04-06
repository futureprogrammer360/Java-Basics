import java.util.Scanner;
import java.util.HashMap;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java Bookstore!");

        HashMap<String, Double> books = new HashMap<String, Double>();
        books.put("Harry Potter", 5.99);
        books.put("Percy Jackson", 7.12);
        books.put("Great Expectations", 19.31);
        books.put("Hunger Games", 10.57);

        System.out.println("Which book do you want (enter the book name): ");
        for (String bookName : books.keySet()) {
            System.out.println(" " + bookName + ": $" + books.get(bookName));
        }

        String book = sc.nextLine();
        double bookPrice = books.get(book);
        System.out.println(book + " is $" + bookPrice);
        System.out.println("Thank you for your purchase, have a good day!");
    }
}
