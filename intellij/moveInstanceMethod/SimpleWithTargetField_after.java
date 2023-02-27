test;
[Test]
    class Foreign {
      void [[@1|foo]] (Test1 test1) {
          test1.field++;
      }
  }

  public abstract class Test1 {
      int field;
      Foreign [[@2|myForeign]];

      void bar () {
          [[->1|&2|foo|myForeign.foo]](this);
      }
  }

