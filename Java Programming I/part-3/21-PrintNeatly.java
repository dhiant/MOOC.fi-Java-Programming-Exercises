class ArrayPrinter {

  public static void main(String[] args) {
    // You can test your method here
    int[] array = { 5, 1, 3, 4, 2 };
    printNeatly(array);
  }

  public static void printNeatly(int[] array) {
    // Write some code in here

    // run the loop from first to the second last element of the array
    for (int i = 0; i < array.length - 1; i++) {
      // print the elements inline
      System.out.print(array[i] + ", ");
    }
    // print the last element of the array
    System.out.println(array[array.length - 1]);
  }
}
