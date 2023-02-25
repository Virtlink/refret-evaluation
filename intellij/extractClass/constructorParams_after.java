test;
[Test]
    class Test {
      final Extracted extracted = new Extracted(this);
  
      void bar(){
          extracted.bar();
      }
  
    String foo() {
      return "";
    }
  
    void bazz() {
        extracted.bar();
    }
  }
[Extracted]
    public class Extracted {
      private final Test test;
      String myT;
  
      public Extracted(Test test) {
          this.test = test;
          this.myT = test.foo();
      }
  
      void bar() {
          System.out.println(myT);
      }
  }
