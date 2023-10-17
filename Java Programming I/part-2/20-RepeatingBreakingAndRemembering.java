import java.util.Scanner;

class RepeatingBreakingAndRemembering {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0, totalCount = 0, oddCount = 0, evenCount = 0;
    double avg = 0.0;
    System.out.println("Give numbers:");

    while (true) {
      int num = Integer.valueOf(scanner.nextLine());

      // provide loop exit condition
      if (num == -1) {
        break;
      }

      // increment the even count if num is even
      if (num % 2 == 0) {
        evenCount++;
      }
      // increment the odd count if num is odd
      else {
        oddCount++;
      }

      // add up all the numbers to calculate average later
      sum += num;
      totalCount++;
      avg = (double) sum / totalCount;
    }

    // out of the loop
    System.out.println("Thx! Bye!");
    System.out.println("Sum:" + sum);
    System.out.println("Numbers: " + totalCount);
    System.out.println("Average: " + avg);
    System.out.println("Even: " + evenCount);
    System.out.println("Odd: " + oddCount);
  }
}
