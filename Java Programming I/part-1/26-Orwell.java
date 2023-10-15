import java.util.Scanner;

class Orwell {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    int num;
    System.out.println("Give a number:");
    num = Integer.valueOf(scan.nextLine());

    if (num == 1984) {
      System.out.println("Orwell");
    }
  }
}
