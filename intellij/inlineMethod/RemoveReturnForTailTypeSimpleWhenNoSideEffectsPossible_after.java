test;
[Test]
    
  class InlineMethod {
      void test() {
          System.out.println("");
      }
  
      InlineMethod other() {
          System.out.println("");
          return this;
      }
  }
  
