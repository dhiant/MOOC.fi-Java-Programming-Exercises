package Arrays;

public class SingleDimensionalArray {

  public static void main(String[] args) {
    // array declaration and instantiation with new method i.e. calling constructor
    String course[] = new String[2];
    course[0] = "Java";
    course[1] = "Data Mining";

    // declaration, instantiation and initialization
    int credit[] = { 3, 3 };

    for (int i = 0; i < course.length; i++) {
      System.out.println("Course: " + course[i]);
    }

    for (int i = 0; i < credit.length; i++) {
      System.out.println("Course credit: " + credit[i]);
    }
  }
}
