test;
[A]
    public class A {
      void test() {
          String s = B.f;
          System.out.println(s);
      }
  
      void callTest() {
          test();
      }
  }
  
  class B {
      public static String f = null;
  }
