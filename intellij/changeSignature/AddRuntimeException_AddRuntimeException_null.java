test;
[AddRuntimeException]
    class Test {
      void foo<caret> () {
      }
  
      void bar () {
          foo();
      }
  }
  
