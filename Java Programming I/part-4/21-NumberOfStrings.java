import java.util.Scanner;

class NumberOfStrings {

  public static void main(String[] args) {
    // read data from keyboard

    Scanner scanner = new Scanner(System.in);
    int count = 0;

    while (true) {
      String str = scanner.nextLine();
      // loop exits when user give string end
      if (str.equals("end")) {
        break;
      }
      count++;
    }
    System.out.println(count);
    scanner.close();
  }
}
