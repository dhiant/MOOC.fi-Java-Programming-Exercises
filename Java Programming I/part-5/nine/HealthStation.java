package nine;

public class HealthStation {

  private int numberOfWeighing;

  public int weigh(Person person) {
    // return the weight of the person passed as the parameter
    numberOfWeighing += 1;
    return person.getWeight();
  }

  public void feed(Person person) {
    person.setWeight(person.getWeight() + 1);
  }

  public int weighings() {
    return this.numberOfWeighing;
  }
}
