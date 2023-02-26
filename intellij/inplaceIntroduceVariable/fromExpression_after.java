test;
[Test]
    class C {
      {
          C expr = new C();
          C c = expr;
      }
  }
