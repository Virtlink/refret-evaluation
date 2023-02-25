test;
[TestSubclass]
    public class TestSubclass extends Test {
      int c;
      public TestSubclass(int a, int b, int c) {
          super(a, b);
          this.c = c;
      }
  }
[Test]
    public class Test {
      int a;
      int b;
  
      public Test(int a, int b) {
          this.a = a;
          this.b = b;
      }
  }
  
