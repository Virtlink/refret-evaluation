test;
[Test]
    class Test {
       void bar() {
         String str = foo();
       }
       static <T> T foo(){
           return InnerClass.invoke();
       }
  
      private static class InnerClass {
          private static <T> T invoke() {
              return null;
          }
      }
  }
