import java.nio.file.Paths;
import java.util.Scanner;

class RecordsFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name of the file:");
    String file = scanner.nextLine();

    // read a file
    try {
      Scanner fileName = new Scanner(Paths.get(file));

      while (fileName.hasNextLine()) {
        String row = fileName.nextLine();
        String[] parts = row.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        System.out.print(name);
        System.out.println("age: " + age + " years");
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    scanner.close();
  }
}
