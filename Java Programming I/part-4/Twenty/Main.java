package Twenty;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // implement here the program that allows the user to enter
    // book information and to examine them
    // create an array list of type Book object named books list
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // ask user for details
    while (true) {
      System.out.print("Title: ");
      String title = scanner.nextLine();
      System.out.println("");

      // if no title is given exit the loop
      if (title.isBlank()) {
        break;
      }

      System.out.print("Pages: ");
      int pages = Integer.valueOf(scanner.nextLine());
      System.out.println("");

      System.out.print("Publication year: ");
      String publishedYear = scanner.nextLine();
      System.out.println("");

      // create a book object
      Book book = new Book(title, pages, publishedYear);
      // add book object to books list
      books.add(book);
    }

    System.out.print("What information will be printed?");
    String text = scanner.nextLine();

    // use for each loop to loop through each item in books list
    for (Book book : books) {
      // compare two string
      if (text.equals("everything")) {
        // use toString method to print all the details of book
        System.out.println(book.toString());
      } else if (text.equals("name")) {
        // print only book
        System.out.println(book.name());
      }
    }
    scanner.close();
  }
}
