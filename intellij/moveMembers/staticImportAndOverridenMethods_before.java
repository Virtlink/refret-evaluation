test;
[bar] {
[B]
    package bar;
  
  public class B {
      public static void foo() {}
      public static void foo(String s) {}
  }
[U]
    import static bar.B.foo;
  
  class Usage {
    void bar() {
      foo();
    }
  }
[A]
    package bar;
  
  public class A {
  }
}
