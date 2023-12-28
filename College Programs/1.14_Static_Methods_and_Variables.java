/*
 *  Static Variables:
 *   A static variable, also known as a class variable, is a variable that belongs to the class rather than a specific instance.
 *  It is declared using the static keyword and is shared among all instances of the class.
 *  Static variables are initialized only once when the class is loaded into memory and retain their value throughout the program's execution.
 *  Static variables can be accessed directly using the class name followed by the variable name, without creating an object of the class.
 *
 *
 * Static Methods:
 *   A static method is a method that belongs to the class itself, not to any particular instance of the class.
 *  It can be invoked directly on the class itself without creating an object of that class.
 *  They can access only other static members (variables or methods) of the class and cannot access instance variables or methods directly.
 *  Static methods are commonly used for utility functions, helper methods, or operations that do not depend on the state of individual objects.
 *
 *
 */

class Student {

  private String name;
  private int roll;
  private String program;

  //   static count variable
  static int count;

  //   constructor
  Student(String n, int r, String p) {
    System.out.println("Object created");
    name = n;
    roll = r;
    program = p;

    // increment count variables
    count++;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll: " + roll);
    System.out.println("Program: " + program);
    System.out.println();
  }

  //   static method
  static void displayCount() {
    System.out.println("Number of students:" + count);
  }
}

class StaticDemo {

  public static void main(String[] args) {
    // static methods can be accessed directly via class name
    Student.displayCount();

    Student s1 = new Student("John", 23, "CS");
    Student s2 = new Student("Jane", 25, "IT");

    Student.displayCount();

    System.out.println("");
    System.out.println("Student Records:");
    s1.display();
    s2.display();
  }
}
