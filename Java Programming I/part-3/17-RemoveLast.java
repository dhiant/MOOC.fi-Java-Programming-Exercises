import java.util.ArrayList;

class RemoveLast {

  public static void main(String[] args) {
    // Try your method in here
    ArrayList<String> strings = new ArrayList<>();

    strings.add("First");
    strings.add("Second");
    strings.add("Third");

    System.out.println(strings);
    // remove last items from list
    removeLast(strings);
    // after removing last item
    System.out.println(strings);
  }

  // array list is a refernce type variable
  // thus changing the list inside the method reflects the change in the original list
  public static void removeLast(ArrayList<String> strings) {
    if (strings.size() > 0) {
      strings.remove(strings.size() - 1);
    }
  }
}
