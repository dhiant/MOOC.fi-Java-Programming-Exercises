/*
 * Dynamic Method Dispatch:
 *  a mechanism that allows a program to determine at runtime which implementation of a method to invoke
 *  based on the actual type of the object being referenced
 *  It enables polymorphism and is a fundamental feature of object-oriented programming.
 *
 */

class Animal {

  void makeSound() {
    System.out.println("Animal is making a sound.");
  }
}

class Dog extends Animal {

  @Override
  void makeSound() {
    System.out.println("Dog is barking!!!");
  }
}

class Dynamic_Method_Dispatch {

  public static void main(String[] args) {
    // cat is the instance variable that holds reference to Animal Object.
    Animal cat = new Animal();
    // dog is the instance variable that holds reference to Dog Object
    Dog dog = new Dog();

    // declare instance variable of type Animal
    Animal unknown;

    // Because of the dynamic method dsipatch
    // program determines which method to invoke based on the object referred to at the time of method invocation
    unknown = cat;
    unknown.makeSound();

    // even though unknown variable is of type Animal it will call the method inside of Dog class
    // because here it holds the reference of Dog object
    unknown = dog;
    unknown.makeSound();
  }
}
