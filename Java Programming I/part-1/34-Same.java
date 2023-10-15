import java.util.Scanner;

class Same {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here.
    String str1, str2;

    System.out.println("Enter the first string:");
    str1 = scan.nextLine();
    System.out.println("Enter the second string:");
    str2 = scan.nextLine();

    if (str1.equals(str2)) {
      System.out.println("Same");
    } else {
      System.out.println("Different");
    }
  }
}
