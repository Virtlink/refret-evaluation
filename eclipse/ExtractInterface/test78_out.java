test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	I m(I foo);
  
  }
[A]
    package p;
  class A implements I {
      public I m(I foo) {
          foo.m(foo);
          return null;
      }
  }
}
