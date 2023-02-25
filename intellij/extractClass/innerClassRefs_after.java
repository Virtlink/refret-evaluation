test;
[Test]
    class Test {
  
      Extracted.Inner p;
  
      {
          Extracted.Inner.get();
      }
  }
  
[Extracted]
    public class Extracted {
      static class Inner {
          public static void get() {
          }
      }
  }
