package Inheritance;

class Animal {

  void displayAnimal() {
    System.out.println("Animal Class is called.");
  }
}

class Dog extends Animal {

  void displayDog() {
    System.out.println("Dog Class is called.");
  }
}

class Cat extends Animal {

  void diplayCat() {
    System.out.println("Cat Class is Called");
  }
}

public class Hierarchial_Inheritance {

  public static void main(String[] args) {
    Dog d1 = new Dog();
    Cat c1 = new Cat();

    d1.displayDog();
    d1.displayAnimal();
    // d1.displayCat() >>>>> error occurs

    c1.diplayCat();
    c1.displayAnimal();
    // c1.diplayDog()   >>>>>>> error occurs

  }
}
