import java.util.Scanner;

class CountingToHundred {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = Integer.valueOf(scanner.nextLine());

    // num is our starting value in a loop
    for (int i = num; i <= 100; i++) {
      System.out.println(i);
    }
  }
}
