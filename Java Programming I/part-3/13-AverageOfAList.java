import java.util.ArrayList;
import java.util.Scanner;

class AverageOfAList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>();

    // implement here a program, that first reads user input
    // adding them on a list until user gives -1.
    while (true) {
      int number = Integer.valueOf(scanner.nextLine());

      if (number == -1) {
        break;
      }
      list.add(number);
    }
    // Then it computes the average of the numbers on the list
    // and prints it.
    int sum = 0;
    int no_of_items = list.size();

    for (Integer number : list) {
      sum += number;
    }
    System.out.println("Average: " + (double) sum / no_of_items);
  }
}
