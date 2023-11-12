import java.nio.file.Paths;
import java.util.Scanner;

class PrintingAFile {

  public static void main(String[] args) {
    try {
      // we pass Path.get("file_name") to Scanner Constructor to read a file
      Scanner scanner = new Scanner(Paths.get("data.txt"));

      // reader.nextLine() return true only if scanner find another line to be read
      while (scanner.hasNextLine()) {
        // read each line
        String row = scanner.nextLine();

        // print each line
        System.out.println(row);
      }
    } catch (Exception e) { // catch block to show error if occurs
      System.out.println("Error: " + e.getMessage());
    }
  }
}
