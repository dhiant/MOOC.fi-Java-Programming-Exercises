import java.util.Scanner;

class Adulthood {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    int age;

    System.out.println("How old are you?");
    age = Integer.valueOf(scan.nextLine());

    if (age >= 18) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You are not an adult");
    }
  }
}
