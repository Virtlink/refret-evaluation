test;
[p] {
[As]
    package p;
  public class As {
      void r(I foo) {
          I local= null;
          foo.m(local);
      }
  }
  
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m(I foo);
  
  }
[A]
    package p;
  class A implements I {
      public void m(I foo) {
          foo.m(foo);
      }
  }
}
