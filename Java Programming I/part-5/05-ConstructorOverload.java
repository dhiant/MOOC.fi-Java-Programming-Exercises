class Product {

  private String name;
  private String location;
  private int weight;

  //    constructor overloading
  public Product(String name, String location, int weight) {
    this.name = name;
    this.location = location;
    this.weight = weight;
  }

  // here  location and weight have default value
  public Product(String name) {
    //        constructor call with passing required parameters
    this(name, "shelf", 1);
  }

  // here weight have default value 1
  public Product(String name, String location) {
    this(name, location, 1);
  }

  // here location has default value "shelf"
  public Product(String name, int weight) {
    this(name, "shelf", weight);
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public String getLocation() {
    return location;
  }

  @Override
  public String toString() {
    return (
      this.name +
      " (" +
      this.weight +
      " kg) can be found from the " +
      this.location
    );
  }
}
