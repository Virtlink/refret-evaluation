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
  
  class A implements I {
  	I a;
  	public void m() {}
  	public void m1() {}
  	void f(){
  		a.m();
  	}
  }
}
