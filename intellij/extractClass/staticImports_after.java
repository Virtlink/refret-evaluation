test;
[foo] {
[Test]
    package foo;
  class Test {
  }
[Extracted]
    package foo;
  
  public class Extracted {
      public static <T> T foo() {
          return null;
      }
  }
[Usage]
    package foo;
  import static foo.Extracted.foo;
  
  class Usage {
    {
      foo();
    }
  }
}
