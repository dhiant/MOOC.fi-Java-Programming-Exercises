class Printer {

  public static void main(String[] args) {
    // You can test the method here
    int[] array = { 5, 1, 3, 4, 2 };
    printArrayInStars(array);
  }

  public static void printArrayInStars(int[] array) {
    // Write some code in here

    // outer loop is to access each arr element
    for (int i = 0; i < array.length; i++) {
      // inner loop runs 'array[i]' times to print asterisks
      for (int j = 0; j < array[i]; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
