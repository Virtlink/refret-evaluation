test;
[IDEADEV6807]
    class Base {
      protected int f;
  
  
  }
  
  class DRV extends Base {
      void f() {
          int f1 = f;
      }
  }
  
