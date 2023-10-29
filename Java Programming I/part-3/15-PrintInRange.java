import java.util.ArrayList;

class PrintInRange {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    // Try your method here
    printNumbersInRange(list, 1, 4);
  }

  public static void printNumbersInRange(
    ArrayList<Integer> numbers,
    int lowerLimit,
    int upperLimit
  ) {
    System.out.println(
      "The number in the range [" + lowerLimit + ", " + upperLimit + "]"
    );
    for (int number : numbers) {
      if (number >= lowerLimit && number <= upperLimit) {
        System.out.println(number);
      }
    }
  }
}
