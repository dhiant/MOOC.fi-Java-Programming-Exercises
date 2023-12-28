package Inheritance;

/*
 * In single inheritance, subclasses inherit the features of one superclass.
 */

class Animal {

  protected String color = "brown";

  void displayAnimal() {
    System.out.println("Animal Class is called");
  }
}

class Dog extends Animal {

  String color = "Brown";

  void displayDog() {
    System.out.println("Dog class is called");
  }
}

class Single_Inheritance {

  public static void main(String[] args) {
    Dog dog = new Dog();

    // method of parent class
    dog.displayAnimal();
    // method of own class
    dog.displayDog();

    // variable of parent class
    System.out.println("Animal is of color " + dog.color);
  }
}
