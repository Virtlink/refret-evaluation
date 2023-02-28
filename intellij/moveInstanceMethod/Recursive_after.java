test;
[MoveMethodTest]
    public class MoveMethodTest {
      void [[@1|foo]] () {
        [[->1|foo()]];
        [[->1|foo()]];
      }
  }
