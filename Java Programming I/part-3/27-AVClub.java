import java.util.Scanner;

class AVClub {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // complete a program here
    // asks user for string until string is empty
    while (true) {
      String string = scanner.nextLine();

      if (string.equals("")) {
        break;
      }

      String[] words = string.split(" ");

      for (int i = 0; i < words.length; i++) {
        if (words[i].contains("av")) {
          System.out.println(words[i]);
        }
      }
    }
  }
}
