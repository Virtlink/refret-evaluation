test;
[Test]
    abstract class A{
      class T{}
      abstract T foo();
  }
  class B<T> extends A{
      void foo(A.T x){}
  
      @Override
      A.T foo() {
          return null;
      }
  }
