/*
 *  Method Overriding:
 * Method overriding in Java refers to the ability of a subclass to provide its own implementation of a method that is already
 * defined in its parent class. It allows the subclass to modify or extend the behavior of the inherited method. To override a method,
 * the subclass must have a method with the same name, return type, and parameter list as the method in the parent class.
 *
 *  Method Overriding allows the subclass to customize the behavior of the method according to its needs or add additional functionality.
 * By using the @Override annotation, the programmer explicitly indicates that the method is intended to override a superclass method.
 *
 *
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

class Method_Overriding {

  public static void main(String[] args) {
    // Creating objects of the super class
    Animal cat = new Animal();

    // here we create animalDog of type Animal with the reference of Dog class
    Animal animalDog = new Dog();

    Dog dog = new Dog();

    // Calling methods using the reference variable
    cat.makeSound();
    animalDog.makeSound();
    dog.makeSound();
  }
}
