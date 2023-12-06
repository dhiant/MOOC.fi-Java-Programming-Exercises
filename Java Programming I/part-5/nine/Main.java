package nine;

public class Main {

  public static void main(String[] args) {
    // write experimental code here to check how your program functions
    Person personA = new Person("Ethan", 1, 110, 7);
    Person personB = new Person("Peter", 33, 176, 85);

    HealthStation childrenHospital = new HealthStation();

    System.out.println("weighings performed: " + childrenHospital.weighings());

    System.out.println();

    System.out.println(
      personA.getName() +
      "'s weight: " +
      childrenHospital.weigh(personA) +
      " kilos"
    );
    System.out.println(
      personB.getName() +
      "'s weight: " +
      childrenHospital.weigh(personB) +
      " kilos"
    );

    System.out.println();

    System.out.println("weighings performed: " + childrenHospital.weighings());

    childrenHospital.feed(personA);
    childrenHospital.feed(personA);
    childrenHospital.feed(personA);

    System.out.println("");

    System.out.println(
      personA.getName() +
      "'s weight: " +
      childrenHospital.weigh(personA) +
      " kilos"
    );
    System.out.println(
      personB.getName() +
      "'s weight: " +
      childrenHospital.weigh(personB) +
      " kilos"
    );
    System.out.println(
      personA.getName() +
      "'s weight: " +
      childrenHospital.weigh(personA) +
      " kilos"
    );
    System.out.println(
      personB.getName() +
      "'s weight: " +
      childrenHospital.weigh(personB) +
      " kilos"
    );

    System.out.println();

    System.out.println("weighings performed: " + childrenHospital.weighings());
  }
}
