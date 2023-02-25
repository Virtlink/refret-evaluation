test;
[B]
    public class B {
      static void foo(String s) {}
  
      void foo(int x) {
    }
  }
[A]
    public interface A {
      void bar() {
      B.foo("");
    }
  }
