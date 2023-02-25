test;
[TestSubclass]
    public class TestSubclass extends Test {
  
      public TestSubclass() {
          super();
      }
  
  }
[Test]
    public class Test {
      final X x;
  
      public Test() {
          x = new X();
      }
  
      protected static class X {
     }
  }
  
