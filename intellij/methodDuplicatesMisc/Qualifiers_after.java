test;
[Test]
    class Utilz {
      static int func(){
          return 1;
      }
  
      static int foo1(){
          return foo2();
      }
  
      static int foo2(){
          return 2*func();
      }
  
  }
  
  class Something {
      Something(){
          int x = Utilz.foo2();
      }
  }
