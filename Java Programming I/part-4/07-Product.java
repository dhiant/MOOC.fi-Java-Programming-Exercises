class Product {

  // instance variables
  private double price;
  private int quantity;
  private String name;

  // parametrized constructor
  public Product(String initialName, double initialPrice, int initialQuantity) {
    this.price = initialPrice;
    this.quantity = initialQuantity;
    this.name = initialName;
  }

  // method to print variable's values
  public void printProduct() {
    System.out.println(
      this.name + " price " + this.price + this.quantity + " pcs"
    );
  }
}
