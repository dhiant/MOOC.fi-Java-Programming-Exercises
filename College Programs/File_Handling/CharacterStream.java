package File_Handling;

import java.io.*;

public class CharacterStream {

  public static void main(String[] args) throws IOException {
    // Create a FileWriter object to write to a file
    FileWriter writer = new FileWriter(
      "C:\\Users\\susha\\OneDrive\\Desktop\\MOOC - Java\\College Programs\\File_Handling\\file.txt"
    );
    // Write content to the file
    writer.write("This is the new file.");

    // close a file
    writer.close();

    // Create a FileReader object to read from the file
    FileReader reader = new FileReader(
      "C:\\Users\\susha\\OneDrive\\Desktop\\MOOC - Java\\College Programs\\File_Handling\\file.txt"
    );

    // Create a char array to store the read characters
    char[] a = new char[50];

    // Read characters from the file and store them in the char array
    reader.read(a);

    System.out.println("The contents of the file are : ");

    // Iterate over the char array and print each character
    for (char c : a) {
      System.out.print(c + " ");
    }

    reader.close();
  }
}
