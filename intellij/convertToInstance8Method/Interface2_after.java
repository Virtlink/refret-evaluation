test;
[Test]
    interface I {
      default void m() {
      }
  }
  
  class C implements I {
  }
  
  interface J extends I {
  }
  
  class D extends C implements J {
  }
  
  class X {
  }
