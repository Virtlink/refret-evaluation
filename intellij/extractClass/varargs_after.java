test;
[Test]
    class Test {
      private final Extracted extracted = new Extracted();
  
      Test(){}
  
    void foo(int... f) {
        extracted.foo(f);
    }
  
    void bar() {
        extracted.foo(1, 2);
    }
  }
[Extracted]
    public class Extracted {
      public Extracted() {
      }
  
      void foo(int... f) {
      }
  }
