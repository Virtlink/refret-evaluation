test;
[PrivateOverload]
    class Base {
      private void f() {}
  
      static void g() {
          ((Base) new Derived()).f();
      }
  }
  
  class Derived extends Base {
      void f() {}
  }
