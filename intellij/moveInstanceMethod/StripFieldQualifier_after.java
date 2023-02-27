test;
[Test]
    public class Test {

      private Bar bar = new Bar();

      private static class Bar {
          private int [[@1|x]];

          public void foo(int [[@2|y]]) {
              [[->1|x]] = [[->2|y]];
          }
      }
  }

