test;
[Test]
    class Bar0 {
      void foo() { }
  }
  class Bar {
    void f() {
      I r = Bar0::foo;
    }
  
  }
  interface I {
    void m(Bar0 b);
  }
