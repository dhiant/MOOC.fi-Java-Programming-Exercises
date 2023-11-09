class Multiplier {

  // when variable name is same as parameter name
  private int number;

  public Multiplier(int number) {
    this.number = number;
  }

  public int multiply(int number) {
    // this keyword is very useful to resolve name conflicts
    // here number as parameter is completely different than number as object's variable name
    // this.number points to the instance variable while number simply mean parameter number
    return this.number * number;
  }
}
