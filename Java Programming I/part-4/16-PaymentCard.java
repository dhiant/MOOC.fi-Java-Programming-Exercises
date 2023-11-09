class PaymentCard {

  private double balance;

  public PaymentCard(double openingBalance) {
    this.balance = openingBalance;
  }

  public String toString() {
    return "The card has a balance of " + this.balance + " euros";
  }

  public void eatAffordably() {
    if (this.balance >= 2.60) {
      this.balance -= 2.60;
    }
  }

  public void eatHeartily() {
    if (this.balance >= 4.60) {
      this.balance -= 4.60;
    }
  }

  public void addMoney(double amount) {
    // set maxlimit
    double maxLimit = 150;

    // if amount is positive
    if (amount > 0) {
      // limit the maximum value for adding money
      if (amount > maxLimit || (amount + this.balance) > maxLimit) {
        this.balance = maxLimit;
      }
      // add amount to balance only when passed amount < maxLimit or result of adding amount & balance < maxLimit
      else {
        this.balance += amount;
      }
    }
  }
}
