import java.util.Scanner;

class IsItTrue {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give a string:");
    String word = scanner.nextLine();

    // two string can be compared with equals method not with "==" sign
    if (word.equals("true")) {
      System.out.println("You got it right!");
    } else {
      System.out.println("Try again!");
    }
  }
}
