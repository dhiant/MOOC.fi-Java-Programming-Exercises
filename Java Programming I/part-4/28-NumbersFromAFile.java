import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class NumbersFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.print("File? ");
    String file = scanner.nextLine();

    System.out.print("Lower bound? ");
    int lowerBound = Integer.valueOf(scanner.nextLine());

    System.out.print("Upper bound? ");
    int upperBound = Integer.valueOf(scanner.nextLine());

    int numbersCount = 0;

    // read a file
    try {
      Scanner readFile = new Scanner(Paths.get(file));

      while (readFile.hasNextLine()) {
        int num = Integer.valueOf(readFile.nextLine());
        list.add(num);
      }
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }

    for (Integer num : list) {
      if (lowerBound <= num && num <= upperBound) {
        numbersCount++;
      }
    }
    System.out.println("Numbers: " + numbersCount);
    scanner.close();
  }
}
