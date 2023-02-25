test;
[I]
    interface I {
    void foo();
  }
[Test]
    class Test implements I {
      private final Extracted extracted = new Extracted();
  
      void foo() {
          extracted.foo();
      }
  }
[Extracted]
    public class Extracted implements I {
      public Extracted() {
      }
  
      void foo() {
          System.out.println("");
      }
  }
