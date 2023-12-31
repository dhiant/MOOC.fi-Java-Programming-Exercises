// 1.25.2 Handling Exceptions With Try-Catch Block

package Exception;

public class Exception_Illustration {

  public static void main(String[] args) {
    try {
      // array of length 5 is initialized
      int a[] = { 1, 2, 3, 4, 5 };
      // but we try to assign the value 10 to array at index 6
      a[6] = 10;
      // thus the above line throws an error
    } catch (Exception e) { // when we do not know the type of exceptions that may occurs simply put Exception Class name
      System.out.println(e.getMessage());
    }
  }
}
