test;
[Test]
    class NestedCall {
      int foo(int p) { return p; }
  
      {
          foo(foo(0));
      }
  }
