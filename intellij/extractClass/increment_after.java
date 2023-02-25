test;
[Test]
    class Test {
      public final Extracted extracted = new Extracted();
  
      void foo() {
      if (extracted.myT++ == 7){}
    }
  }
[Extracted]
    public class Extracted {
      public int myT = 7;
  
      public Extracted() {
      }
  }
