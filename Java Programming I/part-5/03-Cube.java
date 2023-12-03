class Cube {

  private int length;

  public Cube(int len) {
    this.length = len;
  }

  public int volume() {
    return length * length * length;
  }

  public String toString() {
    return (
      "The length of the edge is " +
      this.length +
      " and the volume " +
      this.volume()
    );
  }
}
