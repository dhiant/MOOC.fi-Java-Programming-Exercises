package thirteen;

public class Person {

  private String name;

  // object as an object variable

  // here birthday is an object variable i.e. birthday hold an instance of SimpleDate class
  // or we can say, the type of the birthday variable is SimpleDate
  private SimpleDate birthday;
  private int height;
  private int weight;

  public Person(String name, SimpleDate birthday, int height, int weight) {
    this.name = name;
    this.birthday = birthday;
    this.height = height;
    this.weight = weight;
  }

  // implement an equals method here for checking the equality of objects
  @Override
  public boolean equals(Object personB) {
    // check if two objects has the same memory references
    // in our case two objects have diff memory references so below code not executed
    if (this == personB) {
      return true;
    }

    // here we are checking whether the compared person is not of type Person
    // if the compared person i.e. personB is not of type Person, that means object created is from different classes - so two objects are not equal

    if (!(personB instanceof Person)) {
      return false;
    }

    // here typecasting is performed
    // since equals method receive Object as a parameter it does not have direct access to the fields and methods of Person class
    // So, we are telling compiler to treat compared object(personB) as an instance of Person class, in order to access the fields and methods specifice to Person class
    Person comparedB = (Person) personB;

    // compare all the internal state/values of two objects
    return (
      this.name.equals(comparedB.name) &&
      this.birthday.equals(comparedB.birthday) &&
      this.height == comparedB.height &&
      this.weight == comparedB.weight
    );
  }
}
