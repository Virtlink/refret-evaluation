test;
[AddException]
    class Test {
      void foo<caret> () {
      }
  
      void bar () {
          foo();
      }
  }
  
