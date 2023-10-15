import java.util.Scanner;

class GiftTax {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int giftValue;
    double taxAmount;

    System.out.println("Value of the gift?");
    giftValue = Integer.valueOf(scan.nextLine());

    if (giftValue < 5000) {
      System.out.println("No tax!");
    } else if (giftValue >= 5000 && giftValue < 25000) {
      taxAmount = 100 + ((giftValue - 5000) * 0.08);
      System.out.println("Tax: " + taxAmount);
    } else if (giftValue >= 25000 && giftValue < 55000) {
      taxAmount = 1700 + ((giftValue - 25000) * 0.10);
      System.out.println("Tax: " + taxAmount);
    } else if (giftValue >= 55000 && giftValue < 200000) {
      taxAmount = 4700 + ((giftValue - 55000) * 0.12);
      System.out.println("Tax: " + taxAmount);
    } else if (giftValue >= 200000 && giftValue < 1000000) {
      taxAmount = 22100 + ((giftValue - 200000) * 0.15);
      System.out.println("Tax: " + taxAmount);
    } else {
      taxAmount = 142100 + ((giftValue - 1000000) * 0.17);
      System.out.println("Tax: " + taxAmount);
    }
  }
}
