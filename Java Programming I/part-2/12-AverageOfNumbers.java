import java.util.Scanner;

class AverageOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0, sum = 0;
    double avg = 0.0;

    while (true) {
      System.out.println("Give a number:");
      int num = Integer.valueOf(scanner.nextLine());

      //            first write loop exit condition
      if (num == 0) {
        break;
      }
      sum += num;
      count++;
      //            need type casting here as avg may be a float value
      avg = (double) sum / count;
    }
    System.out.println("Average of the numbers: " + avg);
  }
}
