test;
[Simple]
    class Foreign {
      void foo (Test test) {
          test.field++;
      }
  }
  
  class Test {
      int field;
  
      void bar () {
          new Foreign().foo(this);
      }
  }
  
