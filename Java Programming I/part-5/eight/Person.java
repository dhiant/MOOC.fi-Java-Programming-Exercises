package eight;

public class Person {

  private String name;
  private Pet pet;

  public Person(String name, Pet pet) {
    this.name = name;
    this.pet = pet;
  }

  public Person(String name) {
    this(name, new Pet("Toothless", "dragon"));
  }

  public Person() {
    this("Lilo", new Pet("Stitch", "blue alien"));
  }

  @Override
  public String toString() {
    // here pet is an instance of object i.e. holds the reference to object
    // thus if we only use pet as below
    // we get output as: Leo, has a friendly called Pet@6adca536(Pet@6adca536)
    //        return this.name + ", has a friendly called " + this.pet + "(" + this.pet + ")";
    return (
      this.name +
      ", has a friendly called " +
      this.pet.getName() +
      "(" +
      this.pet.getBreed() +
      ")"
    );
  }
}
