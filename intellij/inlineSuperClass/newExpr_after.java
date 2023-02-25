test;
[Test]
    class Test {
      void foo() {
        Test s = new Test();
        s.bar();
      }
  
      void bar() {}
  }
[Usage]
    class Usage {
    void ba() {
      Test s = new Test();
    }
  }
