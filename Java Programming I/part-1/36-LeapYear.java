import java.util.Scanner;

class LeapYear {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int year;

    System.out.println("Give a year:");
    year = Integer.valueOf(scan.nextLine());

    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          // if the year is divisible all by 4, 100 & 400
          System.out.println("The year is a leap year.");
        }
        // if the year is divisible only by 100 but not by 400
        else {
          System.out.println("The year is not a leap year.");
        }
      }
      // if the year is divisible by 4
      else {
        System.out.println("The year is a leap year.");
      }
    }
    // if the year is not divisible by 4
    else {
      System.out.println("The year is not a leap year.");
    }
  }
}
