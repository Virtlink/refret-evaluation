test;
[Test]
    class Foreign {
      void foo(MoveMethodTest moveMethodTest) {
          class Inner {
              {
                  moveMethodTest.bar();
              }
          }
      }
  }
  
  class MoveMethodTest {
      void bar() {}
  
  }
  
