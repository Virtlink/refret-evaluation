test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	int i= 0;
  	int j= 1;
  
  	void m();
  
  }
[A]
    package p;
  interface A extends I{
  }
}
