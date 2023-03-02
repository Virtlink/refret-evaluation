test;
[Test]
    class Test {
      protected final Object [[@1|myBar]];
      protected final Object [[@2|myBizz]];

      public Test() {
          [[->1|myBar|myBar]] = new Object() { // Was `Test.this.myBar`, but our option is better.
          };
          [[->2|myBizz|myBizz]] = null;        // Was `Test.this.myBizz`, but our option is better.
      }
  }
