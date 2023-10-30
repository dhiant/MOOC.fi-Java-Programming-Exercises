import java.util.Scanner;

class FirstWords {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // write a program here
    while (true) {
      String string = scanner.nextLine();

      // exit condition of loop
      if (string.equals("")) {
        break;
      }

      // split string at whitespace and place inside words array
      String[] words = string.split(" ");

      // print the last array element i.e. last word of string
      System.out.println(words[0]);
    }
  }
}
