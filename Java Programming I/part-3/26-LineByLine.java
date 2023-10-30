import java.util.Scanner;

class LineByLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // complete a program here
    // asks user for string until user gives empty(no) string
    while (true) {
      String string = scanner.nextLine();

      // if user give no input i.e. empty string exit loop
      if (string.equals("")) {
        break;
      }
      // split string at whitespace
      String[] words = string.split(" ");

      // print each word
      for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
      }
    }
  }
}
