test;
[B]
    import java.util.ArrayList;
  
  class B {
      I[] getA() { return null; };
  
      int method(ArrayList list) {
          I[] a = getA();
  
          for(i = 0; i < a.length; i++) {
              I item = a[i];
          }
      }
  }
[I]
    import java.util.ArrayList;
  interface I {
  }
  
  
[A]
    class A implements I {
  }
  
