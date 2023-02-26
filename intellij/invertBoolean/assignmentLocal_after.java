test;
[Test]
    class C {
    void bar() {
      boolean a, bInverted;
      a = !(bInverted = true);
    }
  }
  
