test;
[TestSubclass]
    public class TestSubclass extends Test {
  
      private void foo(){}
  }
[Test]
    public class Test {
      void x() {
        foo();
      }
  }
  
