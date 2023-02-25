test;
[Test]
    class Test {
    void foo(String s) {
      bar(s);
    }
  
    void bar(String s){}
  }
[Usage]
    class Usage {
    void barr(Test t) {
      t.foo("");
    }
  }
