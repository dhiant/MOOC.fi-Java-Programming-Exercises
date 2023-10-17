import java.util.Scanner;

class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int fact = 1, num;

    System.out.println("Give a number:");
    num = Integer.valueOf(scanner.nextLine());

    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.println("Factorial: " + fact);
  }
}
