import java.util.ArrayList;
import java.util.Scanner;

class AgeOfTheOldest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // we need list to store age
    ArrayList<Integer> ages = new ArrayList<Integer>();

    // asks a user for name and age until an empty string is given
    while (true) {
      String string = scanner.nextLine();

      // loop exit condition
      if (string.equals("")) {
        break;
      }
      // split string at comma
      String[] arr = string.split(",");

      // need to convert string type age into integer type
      ages.add(Integer.valueOf(arr[1]));
    }
    // outside while loop
    // compare the age once read all input
    int oldest = ages.get(0);
    for (int age : ages) {
      if (oldest < age) {
        oldest = age;
      }
    }
    System.out.println("Age of the oldest: " + oldest);
  }
}
