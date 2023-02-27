test;
[Test]
    class Foreign {
      void foo(MoveMethodTest [[@2|moveMethodTest]], MoveMethodTest.Inner inner) {
         [[->1|&2|bar|moveMethodTest.bar]] (inner);
      }
  }

  class MoveMethodTest {
      void [[@1|bar]](Inner inner) {}

      class Inner {
      }
  }

