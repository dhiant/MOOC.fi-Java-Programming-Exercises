class Statistics {

  private int count;
  private int sum;

  // inititalize the variables
  public Statistics() {
    this.count = 0;
    this.sum = 0;
  }

  public void addNumber(int number) {
    // find the sum and increment the count
    this.sum += number;
    this.count++;
  }

  public int getCount() {
    return this.count;
  }

  public int sum() {
    return this.sum;
  }

  // find the average
  public double average() {
    if (count > 0) {
      return (double) sum / count;
    }
    return 0.0;
  }
}
/*
Main program file starts here

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create three instances        
        Statistics statAll = new Statistics();
        Statistics statEven = new Statistics();
        Statistics statOdd = new Statistics();

        System.out.println("Enter numbers:");

        // asks user for number until numbers equals to -1
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            // loop exit condition
            if (num == -1) {
                break;
            }

            // pass all the numbers to the object statAll
            statAll.addNumber(num);

            // check if the num is odd or even
            if (num % 2 == 0) {
                // pass only the even num to statEven object
                statEven.addNumber(num);
            } else {
                // pass only the odd num to statOdd object
                statOdd.addNumber(num);
            }
        }

        System.out.println("Sum: " + statAll.sum());
        System.out.println("Sum of even numbers: " + statEven.sum());
        System.out.println("Sum of odd numbers: " + statOdd.sum());

    }
}

 */
