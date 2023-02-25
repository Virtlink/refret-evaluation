test;
[Test]
    class Test {
    void foo(Param param) {
      bar(param.s());
    }
  
    void bar(String s){}
  
      static record Param(String s) {
      }
  }
[Usage]
    class Usage {
    void barr(Test t) {
      t.foo(new Test.Param(""));
    }
  }
