test;
[Test]
    class Test {
       void bar() {
         foo("");
       }
       static <T> void foo(T t){
           new InnerClass<T>(t).invoke();
       }
  
      private static class InnerClass<T> {
          private T t;
  
          public InnerClass(T t) {
              this.t = t;
          }
  
          public void invoke() {
              System.out.println(t);
          }
      }
  }
