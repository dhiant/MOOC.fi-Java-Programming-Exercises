import java.util.Scanner;

class Swap {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // array declaration
    int[] array = new int[5];
    array[0] = 1;
    array[1] = 3;
    array[2] = 5;
    array[3] = 7;
    array[4] = 9;

    int index = 0;
    while (index < array.length) {
      System.out.println(array[index]);
      index++;
    }
    System.out.println("");

    // Implement here
    // asking for the two indices
    // and then swapping them
    System.out.println("Give two indices to swap:");
    int idx1 = Integer.valueOf(scanner.nextLine());
    int idx2 = Integer.valueOf(scanner.nextLine());
    // temp variable
    int temp;

    // swap the elements
    temp = array[idx1];
    array[idx1] = array[idx2];
    array[idx2] = temp;

    System.out.println("");
    index = 0;
    while (index < array.length) {
      System.out.println(array[index]);
      index++;
    }
  }
}
