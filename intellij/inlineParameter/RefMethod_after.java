test;
[A]
    public class A {
      void test() {
          String s = myMethod();
          System.out.println(s);
      }
  
      void callTest() {
          test();
      }
  
      String myMethod() {
          return "";
      }
  }
  
