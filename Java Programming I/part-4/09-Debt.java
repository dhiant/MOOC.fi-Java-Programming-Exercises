class Debt {

  // variables
  private double balance;
  private double interestRate;

  // constructor
  public Debt(double initialBalance, double interestRate) {
    this.balance = initialBalance;
    this.interestRate = interestRate;
  }

  // method to print current balance
  public void printBalance() {
    System.out.println("Current balance: " + this.balance);
  }

  // method to calculate debt amt
  public void waitOneYear() {
    this.balance = this.balance * this.interestRate;
  }
}
