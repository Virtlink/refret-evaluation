test;
[Test]
    class Test {
      static <T> T foo() {
          return InnerClass.invoke();
      }
  
      void bar() {
         foo();
      }
  
      private static class InnerClass {
          private static <T> T invoke() {
              return null;
          }
      }
  }
