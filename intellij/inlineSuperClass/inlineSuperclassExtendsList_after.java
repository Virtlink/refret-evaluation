test;
[Super]
    
  interface Int {}
  
  class Dummy {}
  
  
[Test]
    class Test extends Dummy implements Int {
    Test(){}
  
      public void main() {}
  }
  
  class U {
      public static void main(String[] args) {
         new Test().main();
      }
  }
  
