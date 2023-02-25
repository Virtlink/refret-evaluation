test;
[Bar]
    public class Bar {
      final Test foo = new Test("bar");
  }
[Test]
    public class Test {
      private final String bar;
  
      public Test(final String bar) {
          this.bar = bar;
      }
  }
