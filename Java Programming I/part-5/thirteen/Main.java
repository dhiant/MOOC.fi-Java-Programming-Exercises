package thirteen;

public class Main {

  public static void main(String[] args) {
    // you can write code here to try out your program
    SimpleDate date1 = new SimpleDate(24, 3, 2017);
    SimpleDate date2 = new SimpleDate(23, 7, 2017);

    Person leo = new Person("Leo", date1, 62, 9);
    Person lily = new Person("Lily", date2, 65, 8);

    if (leo.equals(lily)) {
      System.out.println("Yes, two person are identical twins");
    } else {
      System.out.println("No, two person are not identical twins");
    }

    Person leoWithDifferentWeight = new Person("Leo", date1, 62, 9);

    if (leo.equals(leoWithDifferentWeight)) {
      System.out.println("Yes, two person are identical twins");
    } else {
      System.out.println("No, two person are not identical twins");
    }
  }
}
