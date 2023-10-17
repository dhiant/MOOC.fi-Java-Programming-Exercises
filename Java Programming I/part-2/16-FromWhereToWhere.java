import java.util.Scanner;

class FromWhereToWhere {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Write your program here
    System.out.print("Where to?");
    int end = Integer.valueOf(scanner.nextLine());
    System.out.print("Where from?");
    int start = Integer.valueOf(scanner.nextLine());

    // only run loop when end value is greater than or equal to start value
    if (end >= start) {
      for (int i = start; i <= end; i++) {
        System.out.println(i);
      }
    }
  }
}
