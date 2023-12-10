package Arrays;

// there is an Arrays class from which we can use multiple arrays methods like Arrays.sort(), Arrays.equals(), Arrays.binarySearch() and so on
import java.util.Arrays;

public class TheArraysClass {

  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3, 4, 5 };
    int[] array2 = { 1, 2, 3, 4 };

    int[] randomArr = { 4, 7, 2, 1, 0, 9, 11, 43, 22, 12 };

    // check if two arrays are equals
    boolean areArrayEquals = Arrays.equals(array1, array2);
    System.out.println("Arrays are equal? " + areArrayEquals);

    // sort an array
    Arrays.sort(randomArr);
    // print the sorted arr
    for (int i = 0; i < randomArr.length; i++) {
      System.out.print(randomArr[i] + " ");
    }

    // binary search is to be used only after an array is sorted
    int indexAfter = Arrays.binarySearch(randomArr, 4);
    System.out.println("Position of arr element 4: " + indexAfter);
  }
}
