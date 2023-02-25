test;
[B]
    import java.util.ArrayList;
  
  class B {
      I getA() { return new A(); };
      void test(I a) {
      }
  
      int method(ArrayList list) {
          I a = getA();
  
          test(a);
     }
  }
[I]
    import java.util.ArrayList;
  interface I {
  }
  
  
[A]
    class A implements I {
  }
  
