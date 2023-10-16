import java.util.Scanner;

class NumberOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // variable that need to be accessed outside of loop should be declared out of the loop
    int noOfEntries = 0;
    while (true) {
      System.out.println("Give a number:");
      // num variable is used only inside the while loop so better to declare inside loop
      int num = Integer.valueOf(scanner.nextLine());

      //            write the exit condition first
      if (num == 0) {
        break; // exit from the loop
      } else {
        noOfEntries += 1;
        continue;
      }
    }

    System.out.println("Number of numbers: " + noOfEntries);
  }
}
