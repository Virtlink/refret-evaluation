test;
[Test]
    class Foreign {
      void foo(MoveMethodTest [[@2|moveMethodTest]]) {
          class Inner {
              {
                  [[->1|&2|MoveMethodTest.this.bar|moveMethodTest.bar]]();
              }
          }
      }
  }

  class MoveMethodTest {
      void [[@1|bar]]() {}

  }

