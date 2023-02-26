test;
[Test]
    class C {
      {
          new <caret>C();
          new C();
      }
  }
