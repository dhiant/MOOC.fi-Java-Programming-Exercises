import java.util.Scanner;

class SumOfASequence {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0, lastNum;
    System.out.print("Last number?");
    lastNum = Integer.valueOf(scanner.nextLine());

    for (int i = 1; i <= lastNum; i++) {
      sum += i;
    }
    System.out.println("The sum is " + sum);
  }
}
