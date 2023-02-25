test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  import p.A;
  class A implements I {
  	public void m() {}
  	public void m1() {}
  }
}
