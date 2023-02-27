test;
[Test]
    public class Test {

      private Bar bar = new Bar();

      private static class Bar {
          private int [[@1|x]];

          public void foo(int x) {
              [[->1|bar.x|this.x]] = x; // Context: this
          }
      }
  }

