class DecreasingCounter {

  private int value; // an object variable for storing the value of the counter

  public DecreasingCounter(int initialValue) {
    this.value = initialValue;
  }

  public void printValue() {
    // Do not change this code!
    System.out.println("value: " + this.value);
  }

  public void decrement() {
    // write the method implementation here
    // the aim is to decrement the value of the counter by one

    // decrement value only if value is greater than 0
    if (this.value > 0) {
      // use unaray minus operator to decrement value by 1
      this.value--;
    }
  }

  // method to reset counter value to zero
  public void reset() {
    this.value = 0;
  }
  // the other methods go here
}
