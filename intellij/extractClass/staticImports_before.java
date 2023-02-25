test;
[foo] {
[Test]
    package foo;
  class Test {
    public static <T> T foo() { return null; }
  }
[Usage]
    package foo;
  import static foo.Test.foo;
  
  class Usage {
    {
      foo();
    }
  }
}
