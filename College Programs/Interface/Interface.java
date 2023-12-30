/*
 * Interface:
 * Interface in java is a reference-type that serves as a contract for classes. Interface cannot be instantiated
 * but they can only be implemented by classes or extended by other interfaces.
 *
 *
 * Declaration:
 * An interface is declared using the interface keyword, followed by the interface name. For example: interface MyInterface.
 *
 * 
 * Method Signatures:
 * Interfaces declare methods without specifying their implementations. Method signatures consist of the method name, return type, and any parameters,
 * but without the method body.All methods of interface are implicitly public and abstract For example:
 * void methodName();
 * int calculate(int x, int y);
 *
 * 
 * Constants: 
 * Interfaces can also declare constants, which are implicitly public, static, and final.
 * These constants can be accessed by implementing classes. For example:
 * interface MyInterface {
    int MY_CONSTANT = 100;
}
 *
 * 
 * Implementation: 
 * Classes implement interfaces using the implements keyword, and they must provide implementations for all the methods
 * declared in the interface
 * 
 * 
 * Interface Inheritance: 
 * Interfaces can extend other interfaces using the extends keyword. This allows for the creation of a hierarchy of interfaces.
 * 
 * 
 * Thus, Interfaces are fundamental in facilitating polymorphism, a key feature in Java's object-oriented programming paradigm.
 */

interface Shape {
  // by default variables and methods here are public
  float PI = 3.1415f;
  float area();
}

class Circle implements Shape {

  int radius;

  Circle(int r) {
    radius = r;
  }

  // so we need to make method area public
  public float area() {
    return PI * radius * radius;
  }
}

class Interface {

  public static void main(String[] args) {
    Circle c = new Circle(5);
    System.out.println("Circle Area : " + c.area());
  }
}
