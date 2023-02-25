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
  	A fA;
  	public void m() {}
  	public void m1() {}
  	void f(){
  		A a= fA;
  		a.m();
  	}
  }
}
