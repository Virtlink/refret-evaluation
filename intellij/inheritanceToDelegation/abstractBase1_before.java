test;
[Base]
    public abstract class Base implements Runnable {
  }
[A]
    public class A extends Base {
       public void run() {
            System.out.println("From A");
       }     
  }
