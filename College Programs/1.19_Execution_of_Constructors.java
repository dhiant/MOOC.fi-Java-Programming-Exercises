/*
 * Use of super() keyword:
 *  The super() keyword in Java is used to invoke the constructor of the parent class within the constructor of the child class
 *  This ensures that the parent class initialization is performed before the child class initialization.
 *  If the subclass constructor does not explicitly invoke a superclass constructor using super(), the compiler automatically inserts a call
 *  to the superclass's default (parameterless) constructor.
 *
 */

class Animal {

  String name;
  String color;

  Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  String showDetails() {
    return "Name of animal: " + name + " and it has " + color + " legs.";
  }
}

class Dog extends Animal {

  int age;

  Dog(String name, String color, int age) {
    // Calling the parameterless constructor using super() keyword
    super("Dog", "Yellow");
    this.age = age;
  }

  String displayAge() {
    return "Dog is " + age + " years old.";
  }
}

class Execution_of_Constructors {

  public static void main(String[] args) {
    Dog dog1 = new Dog("Charlie", "Yellow", 36);

    dog1.showDetails();
    dog1.displayAge();
  }
}
