test;
[Super]
    
  interface Int {}
  
  class Dummy {}
  
  public class Super extends Dummy implements Int {
      public void main() {}
  }
  
  
[Test]
    class Test extends Super{
    Test(){}
  }
  
  class U {
      public static void main(String[] args) {
         new Test().main();
      }
  }
  
