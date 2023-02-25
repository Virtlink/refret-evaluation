test;
[Test]
    class Test {
    void bar() {
       new Extracted.Inner().foo();
    }
  
  }
[Extracted]
    public class Extracted {
      static class Inner {
          void foo() {
          }
      }
  }
