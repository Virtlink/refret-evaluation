test;
[q] {
[I]
    package q;
  
  /** typecomment template*/
  interface I {
  
  	void foo0();
  
  	void foo1();
  
  	void foo2();
  
  	void foo3();
  
  }
}
[p] {
[A]
    package p;
  
  import q.I;
  
  interface A extends I{
  }
}
