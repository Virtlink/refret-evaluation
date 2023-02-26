test;
[Test]
    class Test {
      public int [[1|i]];

      public void usage() {
          int i = [[->1|i|this.i]];
      }
  }
