import java.util.ArrayList;
import java.util.Scanner;

class NameOfTheOldest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // we need to list to separately listed name and age
    ArrayList<Integer> ageList = new ArrayList<Integer>();
    ArrayList<String> nameList = new ArrayList<String>();

    // ask user for name and age until user gives empty line
    while (true) {
      String string = scanner.nextLine();

      // loop exit condition
      if (string.equals("")) {
        break;
      }

      // split string at comma
      String[] arr = string.split(",");
      // add name to namelist
      nameList.add(arr[0]);
      // convert string type age into int type and add to agelist
      ageList.add(Integer.valueOf(arr[1]));
    }
    // out of while loop
    // compare age
    int oldestAge = ageList.get(0);
    for (int age : ageList) {
      if (oldestAge < age) {
        oldestAge = age;
      }
    }
    System.out.println("oldest age: " + oldestAge);
    // find the index of the oldest age
    int indexOfOldestAge = ageList.indexOf(oldestAge);
    // print the name of the oldest person
    System.out.println("Name of the oldest: " + nameList.get(indexOfOldestAge));
  }
}
