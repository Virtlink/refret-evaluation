test;
[Test]
    class Test {
      void foo<caret> () {
      }
  
      void bar () {
          foo();
      }
  }
  
