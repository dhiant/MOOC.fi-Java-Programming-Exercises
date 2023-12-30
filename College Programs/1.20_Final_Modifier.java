/*
 *
 * Final Modifier:
 *  The final modifier is used to declare that a variable, method, or class cannot be modified or overridden or inherited once it has been assigned or defined.
 *  The final modifier provides immutability, restricts inheritance, and ensures method implementation consistency.
 *
 *
 * Final Variables:
 *  When a variable is declared as final, its value cannot be changed after initialization. It acts as a constant.
 *  Once assigned, a final variable becomes read-only. It is typically used for constants, configuration values, or variables
 *  that should not be modified.
 *
 *
 *  Final Methods: When a method is declared as final, it cannot be overridden by a subclass. This ensures that
 *  the method's implementation remains consistent throughout the inheritance hierarchy.
 *
 *
 *  Final Classes: When a class is declared as final, it cannot be subclassed. In other words, it cannot be extended by any other class.
 *  Thus it prevent class from being inherited.
 */

//  Final Variable
class Circle {

  double radius;
  final float PI = 3.1415f;

  Circle(double r) {
    this.radius = r;
    // now PI variable cannot be modified
    // PI = 3.1416f ;
  }

  void area() {
    System.out.println("Area of circle is " + (PI * radius * radius));
  }
}

// Final Method
class Animal {

  final void makeSound() {
    System.out.println("Animal is making a sound");
  }
}

class Dog extends Animal {
  // makeSound cannot be overridden

  /*
   *  void makeSound() {
   * System.out.println("Dog is barking!!!");
   * }
   *
   */
}

// final Class
final class A {
  // members of class A
  // methods of class A
}

/*
 * class B extends A {
 * members of class B
 * methods of class B
}
 */

class Final_Modifier {

  public static void main(String args[]) {
    Circle c = new Circle(5);
    c.area(); // Area of cicle is ............

    Animal animal = new Animal();
    animal.makeSound(); // Animal is making a sound.
  }
}
