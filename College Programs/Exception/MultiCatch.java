// 1.25.3 & 1.25.4 Use of Multiple Catch and Finally Block

package Exception;

public class MultiCatch {

  public static void main(String[] args) {
    //Multiple catch blocks for different exceptions
    try {
      int a = 10 / 0;
      System.out.println("Value of a is: " + a); // this code will exceuted only if there will be no exceptions occurs above this line
    } catch (ArithmeticException ex) { // All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
      System.out.println("Arithmetic exception caught while dividing by zero"); // print in console
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    } catch (NullPointerException nex) {
      System.out.println("Null pointer exception caught");
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    } catch (Exception e) {
      System.out.println("Exception occurs: " + e);
    } finally { // finally block is always executed no matter if exceptions occurs or not or exception is handled or not
      System.out.println("Inside the finally block"); // print in console
    }
    System.out.println("Outside of try-catch-finally block"); // print in console
  }
}
