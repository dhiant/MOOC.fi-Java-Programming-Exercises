import java.util.Scanner;

class OddOrEven {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    int num;

    System.out.println("Give a number:");
    num = Integer.valueOf(scan.nextLine());

    if (num % 2 == 0) {
      System.out.println("Number " + num + " is even.");
    } else {
      System.out.println("Number " + num + " is odd.");
    }
  }
}
