test;
[Test]
    class Example {
      private class X<T> {}
      private <T> X<T> foo() { return new X<T>(); }
      private <T> X<T> boo(X<T> x) {return x;}
      private void goo() {
          X<Integer> x = boo(this.<Integer>foo());
      }
  }
