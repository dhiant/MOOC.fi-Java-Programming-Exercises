import java.util.Scanner;

class SumOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0; // can be accessible outside loop

    while (true) {
      System.out.println("Give a number:");
      // num variable scope is limited inside while loop
      int num = Integer.valueOf(scanner.nextLine());

      //            loop exit condition
      if (num == 0) {
        break;
      }

      //            otherwise
      sum += num;
    }
    System.out.println("Sum of the numbers: " + sum);
  }
}
