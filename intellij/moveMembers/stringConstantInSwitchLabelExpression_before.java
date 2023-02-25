test;
[B]
    public class B {
  
  }
  
  class U {
    public void example(String foo) {
      switch (foo) {
        case A.FOO:
          break;
      }
    }
  }
[A]
    public interface A {
    public static final String FOO = "FOO";
  }
