import java.util.Scanner;

class AverageOfPositiveNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int positiveCount = 0, sum = 0;
    double avg = 0.0;

    while (true) {
      int num = Integer.valueOf(scanner.nextLine());

      // loop exit condition
      if (num == 0) {
        break;
      }

      // calculate avg only for positive numbers
      if (num > 0) {
        sum += num;
        positiveCount++;
        avg = (double) sum / positiveCount;
        continue;
      }
    }
    // if no positive num is provided
    if (positiveCount < 1) {
      System.out.println("Cannot calculate the average");
    } else {
      System.out.println(avg);
    }
  }
}
