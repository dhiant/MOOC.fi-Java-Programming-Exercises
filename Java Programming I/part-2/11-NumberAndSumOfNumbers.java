import java.util.Scanner;

class NumberAndSumOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int sum = 0;

    while (true) {
      System.out.println("Give a number:");
      int num = Integer.valueOf(scanner.nextLine());

      //            loop exit condition
      if (num == 0) {
        break;
      }

      //            otherwise
      sum += num;
      count++;
    }
    System.out.println("Number of numbers: " + count);
    System.out.println("Sum of the numbers: " + sum);
  }
}
