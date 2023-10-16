import java.util.Scanner;

class NumberOfNegativeNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int negativeCount = 0; // the variable is available within the given class

    while (true) {
      System.out.println("Give a number:");
      // num variable has block scope
      int num = Integer.valueOf(scanner.nextLine());

      //           loop exit condition first
      if (num == 0) {
        break;
      }

      //            increment count only for negative number
      if (num < 0) {
        negativeCount++;
      }
    }
    System.out.println("Number of negative numbers: " + negativeCount);
  }
}
