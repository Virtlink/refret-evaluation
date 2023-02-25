test;
[Test]
    class Test {
  
      {
      String s = true ? Extracted.<String>foo() : "";
    }
  }
[Extracted]
    public class Extracted {
      public static <T> T foo() {
          return null;
      }
  }
