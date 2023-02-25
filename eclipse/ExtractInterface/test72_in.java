test;
[p] {
[As]
    package p;
  public class As {
      void r(A foo) {
          A local= null;
          foo.m(local);
      }
  }
  
[A]
    package p;
  class A {
      public void m(A foo) {
          foo.m(foo);
      }
  }
}
