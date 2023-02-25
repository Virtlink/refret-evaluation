test;
[Test]
    class Test {
      final Extracted extracted = new Extracted();
  
      public int getMyT() {
          return extracted.getMyT();
      }
    void bar(){
      int i = extracted.getMyT();
    }
  }
[Extracted]
    public class Extracted {
      int myT;
  
      public Extracted() {
      }
  
      public int getMyT() {
          return myT;
      }
  }
