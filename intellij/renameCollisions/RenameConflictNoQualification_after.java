test;
[Test]
    interface A {
      default void f() {}
      default void f() {
          f();
      }
  }
  
  class Client1 implements A {
      Client2 a;
      @Override
      public void f() {
          a.f();
      }
  }
  
  class Client2 implements A {
      @Override
      public void f() { }
  }
  
