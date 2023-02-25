test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	int X= 0;
  	int Y= I.X + I.X;
  
  }
[A]
    package p;
  class A implements I {
  }
}
