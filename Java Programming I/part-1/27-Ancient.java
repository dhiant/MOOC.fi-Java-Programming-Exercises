import java.util.Scanner;

class Ancient {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    int year;

    System.out.println("Give a year");
    year = Integer.valueOf(scan.nextLine());

    if (year < 2015) {
      System.out.println("Ancient history!");
    }
  }
}
