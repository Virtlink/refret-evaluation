test;
[Test]
    class Foreign {
      void foo (Test1.Inner i, Test1 test1) {
        test1.new Inner();
      }
  
      class Inner {}
  }
  
  
  public abstract class Test1 {
  
      class Inner {}
  
      void bar () {
          new Foreign().foo(new Inner(), this);
      }
  }
