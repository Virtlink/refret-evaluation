test;
[Test]
    class Test {
      final Extracted extracted = new Extracted();
  
      void bar(){
          extracted.bar();
      }
  
    void foo() {
        extracted.bar();
    }
  }
[Extracted]
    public class Extracted {
      String myT = "";
  
      public Extracted() {
      }
  
      void bar() {
          System.out.println(myT);
      }
  }
