test;
[SimpleWithTargetField]
    class Foreign {
      void foo (Test1 test1) {
          test1.field++;
      }
  }
  
  public abstract class Test1 {
      int field;
      Foreign myForeign;
  
      void bar () {
          myForeign.foo(this);
      }
  }
  
