import java.util.ArrayList;
import java.util.Scanner;

class OnlyTheseNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int startingIndex, endingIndex;
    ArrayList<Integer> numbers = new ArrayList<>();

    while (true) {
      int number = Integer.valueOf(scanner.nextLine());
      if (number == -1) {
        break;
      }

      numbers.add(number);
    }

    System.out.println("From where?");
    startingIndex = Integer.valueOf(scanner.nextLine());
    System.out.println("To where?");
    endingIndex = Integer.valueOf(scanner.nextLine());

    // iterate over array list
    for (int i = startingIndex; i <= endingIndex; i++) {
      System.out.println(numbers.get(i));
    }
  }
}
