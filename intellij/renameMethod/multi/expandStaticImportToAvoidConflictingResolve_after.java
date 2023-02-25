test;
[foo] {
[Foo1]
    package foo;
  import bar.Bar;
  
  public class Foo {
      protected static Object bar(int i) {
          return Bar.bar();
      }
  
      static void bar(int i, int j) {}
  }
[Foo]
    package foo;
  import bar.Bar;
  
  public class Foo {
      protected static Object bar() {
          return Bar.bar();
      }
  }
}
[bar] {
[Bar]
    package bar;
  public class Bar {
    public static Object bar() {
      return new Object();
    }
  }
}
