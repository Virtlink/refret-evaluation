test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  }
[A]
    package p;
  
  class A implements I {
  	I[] a= new A[1];
  }
  
}
