//1.27.1  Usage of byte stream classes in Java for file input and output operations

package File_Handling;

// need to import files
import java.io.*;

public class IOStream {

  // method main() can throws exception during input/output operations
  // thus we're using throws keyword in main method definition
  public static void main(String[] args) throws IOException {
    // create objects of Input and Output streams
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      // create input stream from file name
      in = new FileInputStream("input.txt");
      // create output stream to write data into the file
      out = new FileOutputStream("output.txt", true); // append mode is set as true, so that it will not overwrite existing content

      int c;
      while ((c = in.read()) != -1) { // read() returns -1 when EOF is reached
        System.out.print((char) c); // print a character
        out.write(c); // write a byte
      }
    } finally {
      // close both streams using finally block so that
      // even if an exception occurs, the resources will be released i.e. it prevents resource from leak
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
