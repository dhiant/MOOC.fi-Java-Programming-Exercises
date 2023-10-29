import java.util.ArrayList;

class Sum {

  public static void main(String[] args) {
    // Try your method here
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // call sum method
    sum(list);
  }

  public static int sum(ArrayList<Integer> numbers) {
    int sum = 0;
    // iterate using for-each loop
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
