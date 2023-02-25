test;
[B]
    public class B {
    void foo(int x) {
    }
  }
[A]
    public interface A {
    private static void foo(String s) {}
    void bar() {
      foo("");
    }
  }
