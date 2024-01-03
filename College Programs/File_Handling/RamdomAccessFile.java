// 1.27.3   Random Access File

/* RandomAccessFile:
 * This class allows us to move back and forth in the file that enable us to read/write content from/to file.
 * Here we use writeUTF(), writeInt(), readUTF(), readInt(),seek() and getPointer() methods
 */

package File_Handling;

import java.io.*;

public class RamdomAccessFile {

  public static void main(String[] args) {
    try {
      // Create a Random Access file object by passing the name of the file in which we want to
      // create/open the file. If the file does not exist, it will be created.
      RandomAccessFile randomAccessFile = new RandomAccessFile(
        "randomaccessfile.txt",
        "rw"
      );

      System.out.println("Writing data into the file: ");
      // Write some data into the file using write() method.
      randomAccessFile.writeUTF("Hello World!");
      randomAccessFile.writeInt(987654321);

      // Set the file pointer to the beginning of the file using seek().
      randomAccessFile.seek(0);
      System.out.println("\nReading data from the file :\n");

      // read strings from the file
      System.out.println(randomAccessFile.readUTF());

      // get the pointer position
      long pos = randomAccessFile.getFilePointer();
      System.out.println("Current Position: " + pos);

      //  read phone number(int)
      System.out.println(randomAccessFile.readInt());

      // set file pointer to the beginning
      randomAccessFile.seek(0);
      // read string
      System.out.println(randomAccessFile.readUTF());

      // set the file pointer to the position from where phone number has been written
      randomAccessFile.seek(pos);
      System.out.println(randomAccessFile.readInt());

      // Close the RandomAccessFile object.
      randomAccessFile.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
