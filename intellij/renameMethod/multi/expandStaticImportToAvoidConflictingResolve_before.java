test;
[foo] {
[Foo1]
    package foo;
  import static bar.Bar.createBar;
  public class Foo {
      protected static Object bar(int i) {
          return createBar();
      }
  
      static void bar(int i, int j) {}
  }
[Foo]
    package foo;
  import static bar.Bar.createBar;
  public class Foo {
      protected static Object bar() {
          return createBar();
      }
  }
}
[bar] {
[Bar]
    package bar;
  public class Bar {
    public static Object createBar() {
      return new Object();
    }
  }
}
