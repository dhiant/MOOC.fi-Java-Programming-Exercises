package Thread;

class MyRunnable extends Thread {

  String name;

  public MyRunnable(String name) {
    // use setName()
    this.name = name;
    System.out.println("Creating:" + name);
  }

  @Override
  public void run() {
    System.out.println("Running: " + name);

    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Printing: " + i + " " + name);
        sleep(i * 100);
      }
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Exiting: " + name);
  }
}

public class ThreadProperties {

  public static void main(String[] args) {
    MyRunnable t1 = new MyRunnable("Thread1");
    MyRunnable t2 = new MyRunnable("Thread2");

    t1.setName("Thread1");
    t2.setName("Thread2");

    t1.setPriority(7);
    t2.setPriority(10);

    System.out.println(t1.getName() + " has an id: " + t1.getId());
    System.out.println(t2.getName() + " has an id: " + t2.getId());

    System.out.println("Is Thread1 Alive? " + t1.isAlive());
    System.out.println("Is Thread2 Alive? " + t2.isAlive());

    t1.start();

    System.out.println("Is Thread1 Alive? " + t1.isAlive());
    System.out.println("Is Thread2 Alive? " + t2.isAlive());

    t2.start();

    System.out.println("Is Thread1 Alive? " + t1.isAlive());
    System.out.println("Is Thread2 Alive? " + t2.isAlive());
  }
}
