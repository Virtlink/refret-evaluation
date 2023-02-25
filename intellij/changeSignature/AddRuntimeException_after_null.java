test;
[AddRuntimeException]
    class Test {
      void foo () throws RuntimeException {
      }
  
      void bar () {
          foo();
      }
  }
  
