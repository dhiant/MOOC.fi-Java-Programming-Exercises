package Nineteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // implement here your program that uses the TelevisionProgram class

    ArrayList<TelevisionProgram> programs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.println("");

      // if no name is given exit the loop
      if (name.isBlank()) {
        break;
      }

      System.out.print("Duration:");
      int duration = Integer.valueOf(scanner.nextLine());
      System.out.println("");

      // create an program object
      TelevisionProgram program = new TelevisionProgram(name, duration);
      // add object to list
      programs.add(program);
    }

    System.out.print("Program's maximum duration?");
    int maxDuration = Integer.valueOf(scanner.nextLine());

    // loop through each item in list
    for (TelevisionProgram program : programs) {
      // check if each program's duration is less than or equal to maxDuration
      if (program.getDuration() <= maxDuration) {
        System.out.println(
          program.getName() + ", " + program.getDuration() + " minutes"
        );
      }
    }
    scanner.close();
  }
}
