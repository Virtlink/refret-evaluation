test;
[Test]
    interface Foreign {
      default void foo (Test1 test1) {
          test1.field++;
      }
  }
  
  class ForeignImpl implements Foreign {
  }
  
  
  public abstract class Test1 {
      int field;
  
      void bar () {
          new ForeignImpl().foo(this);
      }
  }
