test;
[Test]
    class Foreign {
      void foo(MoveMethodTest moveMethodTest, MoveMethodTest.Inner inner) {
         moveMethodTest.bar (inner);
      }
  }
  
  class MoveMethodTest {
      void bar(Inner inner) {}
  
      class Inner {
      }
  }
  
