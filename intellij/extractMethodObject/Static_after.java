test;
[Test]
    class Test {
    static void foo(){
        InnerClass.invoke();
    }
  
      void bar() {
      foo();
    }
  
      private static class InnerClass {
          private static void invoke() {
              int i = 0;
          }
      }
  }
