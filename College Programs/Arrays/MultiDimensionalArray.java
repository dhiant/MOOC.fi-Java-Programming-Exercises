package Arrays;

public class MultiDimensionalArray {

  public static void main(String args[]) {
    // declare of 2 dimensional array with rows 2 and columns 4
    int array[][] = new int[3][4]; // declaration & instantation

    // declaration, instantation & initialization
    // here row >> 3 and column >> 2
    int matrix[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

    // Filling the array
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        array[i][j] = (i + 1) * (j + 1);
      }
    }

    // Printing the array
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    // print the matrix
    // i loop runs for row
    for (int i = 0; i < 3; i++) {
      // here j loop runs for column
      for (int j = 0; j < 2; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      //  soon we print all the columns in the specifed row print next line
      System.out.println();
    }
  }
}
