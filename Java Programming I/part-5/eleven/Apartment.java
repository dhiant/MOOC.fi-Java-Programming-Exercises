package eleven;

public class Apartment {

  private int rooms;
  private int squares;
  private int pricePerSquare;

  public Apartment(int rooms, int squares, int pricePerSquare) {
    this.rooms = rooms;
    this.squares = squares;
    this.pricePerSquare = pricePerSquare;
  }

  public boolean largerThan(Apartment compared) {
    //  compare apartment area - squares
    return (this.squares > compared.squares);
  }

  //  difference is always in absolute form
  public int priceDifference(Apartment compared) {
    int cost_of_apartment_called = this.squares * this.pricePerSquare;
    int cost_of_apartment_compared = compared.squares * compared.pricePerSquare;

    if (cost_of_apartment_called > cost_of_apartment_compared) {
      return (cost_of_apartment_called - cost_of_apartment_compared);
    }
    //  this is like an else part - executes only when this.pricePerSqaure < compared.pricePerSquare
    return (cost_of_apartment_compared - cost_of_apartment_called);
  }

  public boolean moreExpensiveThan(Apartment compared) {
    int cost_of_apartment_called = this.squares * this.pricePerSquare;
    int cost_of_apartment_compared = compared.squares * compared.pricePerSquare;

    if (cost_of_apartment_called > cost_of_apartment_compared) {
      return true;
    }
    return false;
  }
}
