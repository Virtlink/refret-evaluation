test;
[ChainedConstructorWithSpacesInvalidation]
    public class Foo {
      private Foo(String s) {}
  
    {
      Foo foo = new Foo("a" + " " + "b")
    }
  }
