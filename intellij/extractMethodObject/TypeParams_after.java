test;
[Test]
    class Test {
     <T> void foo(T t){
         new InnerClass<T>(t).invoke();
     }
  
      void bar() {
       foo("");
     }
  
      private class InnerClass<T> {
          private T t;
  
          public InnerClass(T t) {
              this.t = t;
          }
  
          public void invoke() {
              System.out.println(t);
          }
      }
  }
