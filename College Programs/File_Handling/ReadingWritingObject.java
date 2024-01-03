// 1.27.4  Reading and Writing Objects

/*
 * Serialization:
 * It is the process of converting java objects to byte-streams in order to writes objects into a file.
 * When a class implements import.java.Serializable interface, it's objects can be Serializable.
 * ObjectInputStream & ObjectOutputStream are used to read/write java objects.
 */

package File_Handling;

import java.io.*;

// Implements the Serializable interface to enable serialization.
class Person implements Serializable {

  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Name: " + name + " Age: " + age + " Gender: " + gender;
  }
}

public class ReadingWritingObject {

  public static void main(String[] args) {
    // Creates two Person objects, p1 and p2.
    Person p1 = new Person("Ram", 32, "Male");
    Person p2 = new Person("Sita", 30, "Female");

    try {
      // Create a FileOutputStream object fos to write data into the file "myobject.txt".
      FileOutputStream fos = new FileOutputStream("myobject.txt");
      // Create an ObjectOutputStream oos to write objects into the fos stream.
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      System.out.println("Objects are being written.");
      // write objects to file
      oos.writeObject(p1);
      oos.writeObject(p2);

      System.out.println("Objects written successfully!");
      // Close both streams.
      oos.close();
      fos.close();

      // Now read the objects from the file using FileInputStream and ObjectInputStream.
      FileInputStream fis = new FileInputStream("myobject.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      // Read objects from file
      Person pr1 = (Person) ois.readObject();
      Person pr2 = (Person) ois.readObject();

      System.out.println("Read from file : ");
      System.out.println(pr1.toString());
      System.out.println(pr2.toString());

      // Close both streams.
      ois.close();
      fis.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
