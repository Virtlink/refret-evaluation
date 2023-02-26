test;
[A]
    public class A {
  
      public void test() {
          (new Object() {
              void doTest() {
              }
          }).doTest();
      }
  }
