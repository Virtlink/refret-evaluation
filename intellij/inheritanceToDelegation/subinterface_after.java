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
          a.getMyDelegate().run();
      }
  }
[A]
    public class A extends B {
      private final MyJ myDelegate = new MyJ();
  
      public J getMyDelegate() {
          return myDelegate;
      }
  
      private class MyJ implements J {
          public void run() {
          }
      }
  }
