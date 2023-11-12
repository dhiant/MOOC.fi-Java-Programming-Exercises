import java.nio.file.Paths;
import java.util.Scanner;

class PrintingASpecifiedFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Which file should have its contents printed?");
    String fileName = scanner.nextLine();

    try {
      // create another scanner named as reader
      Scanner reader = new Scanner(Paths.get(fileName));

      // now use reader to read contents from the file
      while (reader.hasNextLine()) {
        // read each line from file
        String row = reader.nextLine();
        // print that line on console
        System.out.println(row);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    scanner.close();
  }
}
