package Thread;

class ThreadDemo extends Thread {

  private String name;

  public ThreadDemo(String str) {
    this.name = str;
    System.out.println("Creating:" + name);
  }

  @Override
  public void run() {
    System.out.println("Running: " + name);

    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Printing: " + i + " " + name);
        // don't forget to call Thread.Sleep()
        // the method cause currently running thread to cease from execution for the specified no of milliseconds
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Exiting: " + name);
  }
}

public class ThreadCreationExtendingThreadClass {

  public static void main(String[] args) throws InterruptedException {
    ThreadDemo t1 = new ThreadDemo("Thread1");
    ThreadDemo t2 = new ThreadDemo("Thread2");
    t1.start();
    t2.start();
  }
}
