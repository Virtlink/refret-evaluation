test;
[Test]
    class Test {
      protected final Object [[@1|myBar]];
      protected final Object [[@2|myBizz]];

      public Test() {
          [[->1|myBar|Test.this.myBar]] = new Object() {
          };
          [[->2|myBizz|Test.this.myBizz]] = null;
      }
  }
