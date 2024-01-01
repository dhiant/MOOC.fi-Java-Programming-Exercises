package Thread;

class RunnableDemo implements Runnable {

  String threadName;

  RunnableDemo(String name) {
    threadName = name;
    System.out.println("Creating: " + threadName);
  }

  // this run method is defined in Runnable Interface(built-in Interface)
  // run() method is the entry point for thread
  // don't forget to use public keyword
  public void run() {
    System.out.println("Running: " + threadName);

    // handle exceptions inside run() method
    try {
      for (int i = 4; i > 0; --i) {
        System.out.println("Printing: " + i + " " + threadName);
        Thread.sleep(i * 100);
      }
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Thread is exiting.");
  }
}

public class ThreadCreationWithRunnableInterface {

  public static void main(String[] args) {
    // create instance of class that implements Runnable interface
    RunnableDemo R1 = new RunnableDemo("Thread1");
    RunnableDemo R2 = new RunnableDemo("Thread2");

    // create instances of Thread
    Thread T1 = new Thread(R1);
    Thread T2 = new Thread(R2);

    // start Thread >> the start() method calls run() method implicitly
    T1.start();
    T2.start();
  }
}
