test;
[B]
    public class B {
    static boolean truth = false;
    static void important() {
      System.out.println(2);
    }
  }
[A]
    class One {
      static boolean truth = true;
      static void important() {
          System.out.println(1);
      }
  }
  class A extends One {
      Two() {
          important();
          System.out.println(truth);
      }
  }
