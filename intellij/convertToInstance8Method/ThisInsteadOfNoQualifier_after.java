test;
[Test]
    class Bar {
      private void foo() {
        f();
        Runnable r = this::f;
      }
  
      void f() {}
  
  }
