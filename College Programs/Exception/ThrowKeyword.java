// 1.25.6   Throw Keyword

/*
 * Throw keyword:
 * The throw keyword is used to explicitly throw an exception from within a method or code block.
 *  It is typically used to handle exceptional situations or error conditions.
 */

package Exception;

import java.util.Scanner;

public class ThrowKeyword {

  static void checkIfVisitorIsAllowed(int age) {
    try {
      if (age >= 18) {
        System.out.println("Welcome to the club.");
      } else {
        throw new Exception("Sorry! We can't let you in.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    System.out.println("What is your age?");
    Scanner scan = new Scanner(System.in);

    // need to convert string into int
    int age = Integer.valueOf(scan.nextLine());
    checkIfVisitorIsAllowed(age);
    scan.close();
  }
}
