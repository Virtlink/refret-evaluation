test;
[Test]
    class Foreign {
      /**
       * @param test1
       */
      void foo (Test1 test1) {
        test1.bar();
      }
  }
  
  public abstract class Test1 {
  
      /**
       * @see Foreign#foo(Test1)
       */
      void bar () {
      }
  }
