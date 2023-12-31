// 1.25.7   Creating Exception Classes

package Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {

  InvalidAgeException(String s) {
    super(s);
  }
}

public class Custom_Exception {

  static void checkIfVisitorIsAllowed(int age) {
    try {
      if (age >= 18) {
        System.out.println("Welcome to the club");
      } else {
        throw new InvalidAgeException("Sorry! We can't let you in.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    System.out.println("Can you please tell us your age?");
    Scanner scanner = new Scanner(System.in);
    int age = Integer.valueOf(scanner.nextLine());

    checkIfVisitorIsAllowed(age);

    scanner.close();
  }
}
