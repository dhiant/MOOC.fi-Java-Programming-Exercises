package Inheritance;

class Animal {

  void displayAnimal() {
    System.out.println("Animal Class is called");
  }
}

class Dog extends Animal {

  void displayDog() {
    System.out.println("Dog class is called");
  }
}

class BlackDog extends Dog {

  String color = "Black";

  void displayBlackDog() {
    System.out.println(color + " dog is called");
  }
}

public class Multilevel_inheritance {

  public static void main(String args[]) {
    // Creating object of the sub-sub class (BlackDog)
    BlackDog blackDog = new BlackDog();

    blackDog.displayAnimal();
    blackDog.displayDog();
    blackDog.displayBlackDog();
  }
}
