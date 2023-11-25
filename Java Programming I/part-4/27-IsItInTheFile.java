import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class IsItInTheFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    // set a flag variable
    boolean isErrorOccur = false;

    System.out.println("Name of the file:");
    String file = scanner.nextLine();

    System.out.println("Search for:");
    String searchedFor = scanner.nextLine();

    // read a file
    try {
      Scanner readFile = new Scanner(Paths.get(file));

      while (readFile.hasNextLine()) {
        String row = readFile.nextLine();
        list.add(row);
      }
    } catch (Exception e) {
      System.out.println("Reading the file " + file + " failed.");
      isErrorOccur = true;
    }

    // if there is no error
    if (!isErrorOccur && list.contains(searchedFor)) {
      System.out.println("Found!");
    } else {
      System.out.println("Not found.");
    }
    scanner.close();
  }
}
