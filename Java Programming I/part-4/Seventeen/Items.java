package Seventeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

  public static void main(String[] args) {
    // implement here your program that uses the class Item

    ArrayList<Item> items = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Name: ");
      String name = scanner.nextLine();

      // loop exit condition
      if (name.equals("")) {
        break;
      }

      // create an obj first
      Item obj = new Item(name);
      // add obj to list
      items.add(obj);
    }
    // use for each loop to print each obj in list
    // Note: here each item in list is object so we use Item name: items
    for (Item name : items) {
      System.out.println(name);
    }
    scanner.close();
  }
}
