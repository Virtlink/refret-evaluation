test;
[A]
    public class A {
      void test() {
          String s = [[->1|f|B.f]];
          System.out.println(s);
      }

      void callTest() {
          test();
      }
  }

  class B {
      public static String [[@1|f]] = null;
  }
