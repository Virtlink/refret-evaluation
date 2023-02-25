test;
[TestSubclass]
    public class TestSubclass extends Test {
  
      public TestSubclass(int a1) {
          super(a1);
      }
  }
  
[Test]
    public class Test {
      final int b;
      final int a;
      final int c;
  
      public Test(int a1) {
          a = a1;
          c = 42;
          b = c + 1;
      }
  }
  
