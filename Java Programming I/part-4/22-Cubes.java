import java.util.Scanner;

class Cubes {

  public static void main(String[] args) {
    // asks user for input
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String str = scanner.nextLine();

      if (str.equals("end")) {
        break;
      }

      // integer equivalent of string
      int num = Integer.valueOf(str);
      System.out.println(num * num * num);
    }
    scanner.close();
  }
}
