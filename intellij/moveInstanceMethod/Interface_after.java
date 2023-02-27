test;
[Test]
    interface Foreign {
      default void foo (Test1 [[@2|test1]]) {
          [[->1|&2|field|test1.field]]++;
      }
  }

  class ForeignImpl implements Foreign {
  }


  public abstract class Test1 {
      int [[@1|field]];

      void bar () {
          new ForeignImpl().foo(this);
      }
  }
