test;
[Test]
    public class Test {
  
      private Bar bar = new Bar();
  
      private static class Bar {
          private int x;
  
          public void foo(int x) {
              this.x = x;
          }
      }
  }
  
