import java.util.Scanner;

class BooleanInput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // write your program here
    System.out.println("Write something:");
    boolean value = Boolean.valueOf(scanner.nextLine());
    System.out.println("True or false? " + value);
  }
}
