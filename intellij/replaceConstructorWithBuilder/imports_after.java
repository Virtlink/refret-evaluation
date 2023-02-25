test;
[Bar]
    import foo.Builder;
  
  public class Bar {
      final Test foo = new Builder().setBar("bar").createTest();
  }
[Test]
    public class Test {
      private final String bar;
  
      public Test(final String bar) {
          this.bar = bar;
      }
  }
[foo] {
[Builder]
    package foo;
  
  public class Builder {
      private String bar;
  
      public Builder setBar(String bar) {
          this.bar = bar;
          return this;
      }
  
      public Test createTest() {
          return new Test(bar);
      }
  }
}
