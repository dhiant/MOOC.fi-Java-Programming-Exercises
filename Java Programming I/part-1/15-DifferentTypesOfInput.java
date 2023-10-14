import java.util.Scanner;

class DifferentTypesOfInput {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    System.out.println("Give a string:");
    String msg = scan.nextLine();

    System.out.println("Give an integer:");
    int wholeNum = Integer.valueOf(scan.nextLine());
    System.out.println("Give a double:");
    double decimalNum = Double.valueOf(scan.nextLine());

    System.out.println("Give a boolean:");
    boolean value = Boolean.valueOf(scan.nextLine());
    System.out.println("You gave the string " + msg);
    System.out.println("You gave the integer " + wholeNum);
    System.out.println("You gave the double " + decimalNum);
    System.out.println("You gave the boolean " + value);
  }
}
