test;
[Test]
    class Test {
  
      static void bar(){
          Extracted.foo();
    }
  }
[Extracted]
    public class Extracted {
      static void foo() {
          System.out.println("");
      }
  }
