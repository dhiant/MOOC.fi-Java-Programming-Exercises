package Arrays;

/*
 * for(data_type variable : array | collection) {
 
 body inside the for-each loop
 
 }

 */

/* cons of using this loop
>> cannot run loop in reverse order
>> cannot use index to access elements
>> cannot skip any element 

*/

public class ForEachLoop {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };

    for (int element : array) {
      System.out.println("element: " + element);
    }

    String[] subjects = {
      "Advanced Java Programming",
      "Database Mining",
      "Principles of Management",
      "Software Project Management",
    };

    System.out.println("In 7th semester we are studying following subjects:");
    for (String subject : subjects) {
      System.out.println(subject);
    }
  }
}
