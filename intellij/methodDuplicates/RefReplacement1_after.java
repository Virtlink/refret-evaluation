test;
[Test]
    class Test {
      void bar() {}
  
      public void main() {
          Test1.foo(Test.this);
      }
  }
  
  class Test1 {
    static void foo(Test t) {
        t.bar();
    }
  }
