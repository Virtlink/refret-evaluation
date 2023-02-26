test;
[Test]
    interface I {
    int <caret>m();
  }
  record R(int m) implements I {}
