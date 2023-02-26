test;
[Test]
    class Test {
  
    void f<caret>oo(int... i) {}
  
    {
      foo();
    }
  }
