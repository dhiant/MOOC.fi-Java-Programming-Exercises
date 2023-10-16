import java.util.Scanner;

class SquareRootOfSum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, sum;
    double sqrt;

    num1 = Integer.valueOf(scanner.nextLine());
    num2 = Integer.valueOf(scanner.nextLine());
    sum = num1 + num2;

    if (sum > 0) {
      sqrt = Math.sqrt(sum);
      System.out.println(sqrt);
    }
  }
}
