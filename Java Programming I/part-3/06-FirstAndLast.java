import java.util.ArrayList;
import java.util.Scanner;

class FirstAndLast {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lastItemIndex = 0;
    ArrayList<String> list = new ArrayList<>();

    while (true) {
      String input = scanner.nextLine();
      if (input.equals("")) {
        break;
      }

      list.add(input);
      lastItemIndex = list.size() - 1;
    }

    System.out.println(list.get(0));
    System.out.println(list.get(lastItemIndex));
  }
}
