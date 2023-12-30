interface InterfaceA {
  void methodA();
}

interface InterfaceB {
  void methodB();
}

class classA implements InterfaceA {

  // don't forget to public keyword to interface methods as they are public by default
  public void methodA() {
    System.out.println("A is implemented in class A.");
  }
}

class classB implements InterfaceB {

  public void methodB() {
    System.out.println("B is implemented in class B.");
  }
}

public class Multiple_Interface extends classA implements InterfaceB {

  // as this class implements interface B we have to implement the methodB here
  @Override
  public void methodB() {
    System.out.println("B is implemented in multiple_inheritance class.");
  }

  public static void main(String[] args) {
    Multiple_Interface obj = new Multiple_Interface();

    // calling the method from interface A using object of class that implements it
    obj.methodA();

    // calling the method from interface B using object of class that implements it
    obj.methodB();
  }
}
/*
 * Here, we have 2 interfaces, each containing a single method.
 * Each interface's method are implemented in 2 classes.
 * Then, we extend one class and implement one interface in Multiple_Inheritance Class.
 * Extending a class allows to access methodA in Multiple_Inheritance Class.
 * As we implement interfaceB we need to implement methodB in Multiple_Inheritance Class.
 */
