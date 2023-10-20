class AdvancedAstrology {

  public static void printStars(int number) {
    // part 1 of the exercise
    for (int i = 1; i <= number; i++) {
      System.out.print("*");
    }
    System.out.println("");
  }

  public static void printSpaces(int number) {
    // part 1 of the exercise
    for (int i = 1; i <= number; i++) {
      System.out.print(" ");
    }
  }

  public static void printTriangle(int size) {
    // part 2 of the exercise
    for (int i = 1; i <= size; i++) {
      printSpaces(size - i);
      printStars(i);
    }
  }

  public static void christmasTree(int height) {
    // part 3 of the exercise
    int baseStars = 3;
    int baseSpace = (2 * height - baseStars) / 2;

    for (int i = 0; i < height; i++) {
      int triangleStarCount = 2 * i + 1;
      int triangleSpace = (2 * height - triangleStarCount) / 2;

      printSpaces(triangleSpace);
      printStars(triangleStarCount);
    }

    for (int i = 0; i < 2; i++) {
      printSpaces(baseSpace);
      printStars(baseStars);
    }
  }

  public static void main(String[] args) {
    // The tests are not checking the main, so you can modify it freely.

    printTriangle(5);
    System.out.println("---");
    christmasTree(4);
    System.out.println("---");
    christmasTree(10);
  }
}
