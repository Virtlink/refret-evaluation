test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	I a(I a1, I a2);
  
  }
[A]
    package p;
  interface A extends I{
  }
}
