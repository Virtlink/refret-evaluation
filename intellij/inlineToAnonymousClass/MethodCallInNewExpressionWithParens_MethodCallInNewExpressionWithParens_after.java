test;
[MethodCallInNewExpressionWithParens]
    public class A {
  
      public void test() {
          (new Object() {
              void doTest() {
              }
          }).doTest();
      }
  }
