test;
[Test]
    interface I {
      default void foo() {}
  }
  
  class WithPrivateInner {
    private class Inner implements I {}
  }
  
  class WithUsage {
    void n(I i) {
      i.foo();
    }
  }
