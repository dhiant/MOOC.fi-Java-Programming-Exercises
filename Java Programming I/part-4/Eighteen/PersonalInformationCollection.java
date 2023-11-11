package Eighteen;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

  public static void main(String[] args) {
    // implement here your program that uses the PersonalInformation class

    ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("First name: ");
      String firstName = scanner.nextLine();

      if (firstName.isBlank()) {
        break;
      }
      System.out.println("");
      System.out.print("Last name:");
      String lastName = scanner.nextLine();

      System.out.println("");
      System.out.print("Identification number:");
      String idNumber = scanner.nextLine();

      // create an object
      PersonalInformation person = new PersonalInformation(
        firstName,
        lastName,
        idNumber
      );
      // add object to list
      infoCollection.add(person);
    }

    System.out.println("");
    // print each person firstName and lastName
    for (PersonalInformation person : infoCollection) {
      System.out.println(person.getFirstName() + " " + person.getLastName());
    }
    scanner.close();
  }
}
