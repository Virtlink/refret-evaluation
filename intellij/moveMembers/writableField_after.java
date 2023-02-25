test;
[B]
    public class B {
  
      void foo() {
      A.ONE = "foo";
    }
  }
[A]
    public interface A {
  
      String ONE = "";
  }
