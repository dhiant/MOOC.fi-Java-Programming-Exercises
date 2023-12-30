/*
 * Abstract Class:
 * An abstract class is a class that cannot be instantiated directly but serves as a blueprint for other classes.
 * It is declared using the abstract keyword. An abstract class can contain both abstract and non-abstract methods,
 * as well as fields, constructors, and other members.
 *
 *
 * Cannot be instantiated:
 * An abstract class cannot be used to create objects directly using the new keyword. Instead, it is meant to be extended by other classes
 * that provide implementations for its abstract methods.
 *
 *
 * Can have abstract methods:
 * Abstract methods are methods declared in an abstract class without an implementation. They are meant to be overridden and
 * implemented by the concrete (non-abstract) subclasses that extend the abstract class. Abstract methods are declared using the abstract keyword and
 * do not include a method body. Subclasses must provide concrete implementations for all the abstract methods inherited from the abstract class.
 *
 *
 * Can have non-abstract methods:
 * An abstract class can also have non-abstract methods, which are fully implemented methods that provide default behavior or functionality.
 * Subclasses inherit these methods as they are, without the need for overriding.
 *
 *
 * May have fields, constructors, and other members:
 * Abstract classes can have fields (variables), constructors, and other members, just like regular classes. These members can be accessed
 * by the abstract class itself, its subclasses, and other classes that have access to the abstract class.
 */

package Abstract_Class;

abstract class abstractClass {

  // abstract method
  abstract void abstractMethod();

  // non-abstract method
  void nonAbstractMethod() {
    System.out.println("Non-abstract method in Abstract Class.");
  }
}

class ConcreteClass extends abstractClass {

  // abstractMethod is overridden here.
  @Override
  void abstractMethod() {
    System.out.println("Implement abstract method in Concrete Class.");
  }

  public static void main(String args[]) {
    // Create object of the concrete class
    ConcreteClass obj = new ConcreteClass();
    // Calling a non-abstract method using an object of the concrete class
    obj.nonAbstractMethod();
    // Trying to call an abstract method using an object of the concrete class
    // This will cause compile time error because we are trying to access an abstract method from a concrete class
    // This will cause compile time error because we are trying to access
    // an abstract method from a concrete class
    obj.abstractMethod();
  }
}
/* Abstract Class VS Interface
 Method Implementation: An abstract class can have both abstract and non-abstract methods, whereas all methods in an interface are implicitly 
 abstract and do not contain any implementation.

Multiple Inheritance: An abstract class does not support multiple inheritance, whereas an interface supports multiple inheritance 
by allowing a class to implement multiple interfaces.

Fields: An abstract class can have final, non-final, static, and non-static variables (fields), while interfaces can only declare static and 
final variables.

Interface and Abstract Class Implementation: An abstract class can provide the implementation of an interface by implementing it, but 
an interface cannot provide the implementation of an abstract class.

Declaration Keywords: An abstract class is declared using the abstract keyword, whereas an interface is declared using the interface keyword.

Inheritance Relationships: An abstract class can extend another class and implement multiple interfaces, whereas an interface can only extend 
another interface.

Constructors: An abstract class can have constructors that are used for object initialization. Interfaces cannot have constructors because 
they cannot be instantiated.

Extending an Abstract Class: An abstract class is extended using the extends keyword. While Interface is implemented with implements keyword.

Default Method Implementation: In interfaces, you can provide default method implementations using the default keyword. 
These methods have a default implementation in the interface itself and can be optionally overridden by implementing classes. 
Abstract classes do not support default method implementations.
 */
