import java.util.Scanner;

class Counting {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //  num is our ending point value for a loop
    int num = Integer.valueOf(scanner.nextLine());

    for (int i = 0; i <= num; i++) {
      System.out.println(i);
    }
  }
}
