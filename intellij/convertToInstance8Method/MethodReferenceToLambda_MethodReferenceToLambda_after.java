test;
[MethodReferenceToLambda]
    class Bar0 {
      void foo(Integer i) { }
  }
  class Bar {
    void f() {
      I r = (i, bar) -> bar.foo(i);
    }
  
  }
  interface I {
    void m(Integer i, Bar0 b);
  }
