test;
[VarargMethodToNonVarag]
    class Test {
  
    void f<caret>oo(int... i) {}
  
    {
      foo();
    }
  }
