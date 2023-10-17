import java.util.Scanner;

class SumOfASequenceTheSequel {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    System.out.print("First number?");
    int fNum = Integer.valueOf(scanner.nextLine());
    System.out.print("Second number?");
    int sNum = Integer.valueOf(scanner.nextLine());

    while (fNum <= sNum) {
      sum += fNum;
      fNum++;
    }
    System.out.println("The sum is: " + sum);
  }
}
