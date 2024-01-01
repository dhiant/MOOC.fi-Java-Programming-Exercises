package Thread;

class Counter {

  private int count = 0;

  public synchronized void increment(String threadName) {
    count++;
    System.out.println(threadName + " - Count: " + count);
  }
}

class CounterThread extends Thread {

  private Counter counter;
  private String threadName;

  public CounterThread(Counter counter, String threadName) {
    this.counter = counter;
    this.threadName = threadName;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      counter.increment(threadName);
    }
  }
}

public class ThreadSynchronization {

  public static void main(String[] args) {
    Counter counter = new Counter();

    // Create multiple threads and pass the counter object
    CounterThread thread1 = new CounterThread(counter, "Thread 1");
    CounterThread thread2 = new CounterThread(counter, "Thread 2");

    // Start the threads
    thread1.start();
    thread2.start();
  }
}
