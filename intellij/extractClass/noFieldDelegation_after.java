test;
[Test]
    class Test<T> {
      void foo(T t){}
  }
[Extracted]
    public class Extracted<T> {
      private final Test<T> test;
      T myT;
  
      public Extracted(Test<T> test) {
          this.test = test;
      }
  
      void bar() {
          test.foo(myT);
      }
  }
