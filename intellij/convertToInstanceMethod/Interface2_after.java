test;
[Test]
    interface I {
      void m();
  }
  
  class C implements I {
      public void m() {
      }
  }
  
  interface J extends I {
  }
  
  class D extends C implements J {
  }
  
  class X {
  }
