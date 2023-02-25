test;
[B]
    class B {
  }
[J]
    interface J extends Runnable {
  }
[Usage]
    class Usage {
      public static void main() {
          A a = new A();
          a.run();
      }
  }
[A]
    public class A extends B implements J {
      public void run() {
      }
  }
