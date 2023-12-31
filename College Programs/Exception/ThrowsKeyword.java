// 1.25.5 Use of Throws Keyword

/*
 * Throws keyword:
 * The throws keyword is used in a method declaration to indicate that the method may throw one or more exceptions.
 * It specifies the exception types that the method can potentially throw. The throws keyword appears at the end of a method's signature separated by commas
 *
 */

package Exception;

import java.util.Scanner;

public class ThrowsKeyword {

  // use of throws keyword
  void findRemainder(int num1, int num2) throws ArithmeticException {
    float remainder = num1 / num2;
    System.out.println("Remainder is :" + remainder);
  }

  public static void main(String[] args) {
    System.out.println("Give first numb:");
    Scanner scanner = new Scanner(System.in);
    int dividend = Integer.valueOf(scanner.nextLine());

    System.out.println("Give second numb:");
    int divisor = Integer.valueOf(scanner.nextLine());

    ThrowsKeyword t = new ThrowsKeyword();

    // handle exceptions here
    try {
      t.findRemainder(dividend, divisor);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    scanner.close();
  }
}
