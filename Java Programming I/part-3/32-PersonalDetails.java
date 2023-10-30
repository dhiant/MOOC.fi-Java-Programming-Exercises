import java.util.ArrayList;
import java.util.Scanner;

class PersonalDetails {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // need two list to separately store name and birthyear
    ArrayList<String> nameList = new ArrayList<String>();
    ArrayList<Integer> birthYearList = new ArrayList<Integer>();

    // ask user for input until user gives empty string
    while (true) {
      String string = scanner.nextLine();

      // check if user give empty string
      if (string.equals("")) {
        break;
      }
      // split string and store each word inside array
      String[] arr = string.split(",");
      nameList.add(arr[0]);
      // need to convert string type birth year into int type
      birthYearList.add(Integer.valueOf(arr[1]));
    }

    // compare string length
    String longestName = nameList.get(0);
    for (String name : nameList) {
      if (longestName.length() < name.length()) {
        longestName = name;
      }
    }
    // find avg of birth year
    double avgBirthYear = 0.0;
    int sum = 0, n = birthYearList.size();
    for (int age : birthYearList) {
      sum += age;
    }
    avgBirthYear = (double) sum / n;
    // print the values
    System.out.println("Longest name: " + longestName);
    System.out.println("Average of the birth years: " + avgBirthYear);
  }
}
