test;
[Test]
    class TestClass {
      public static final String s;
  
      static {
          String foo = "foo";
          s = foo.trim();
      }
  }
