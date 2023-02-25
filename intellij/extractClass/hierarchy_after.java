test;
[Test]
    class Test<R>  extends A <R>{
  
      void foo(R t){}
  
  }
[Extracted]
    public class Extracted<R> {
      private final Test<R> test;
      public R myT;
  
      public Extracted(Test<R> test) {
          this.test = test;
      }
  
      void bar() {
          test.foo(myT);
      }
  }
[A]
    class A<T>{
    void foo(T t){}
  }
