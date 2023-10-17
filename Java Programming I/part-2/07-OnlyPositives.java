import java.util.Scanner;

class OnlyPositives {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Give a number:");
      int num = Integer.valueOf(scanner.nextLine());

      // write exit condition first
      if (num == 0) {
        break; // the control goes to the line 27 i.e. end of the loop when num equals to 0
      }

      //            if number is negative
      if (num < 0) {
        System.out.println("Unsuitable number");
        continue; // the control goes back to the line 9  i.e beginning of loop
      } else {
        // print the square positive number
        System.out.println(num * num);
        continue;
      }
    }
  }
}
