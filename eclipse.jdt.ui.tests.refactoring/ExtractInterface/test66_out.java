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
  	public void m() {}
  	public void m1() {}
  	void f(){
  		I a= create();
  		a.m();
  	}
  	I create(){
  		return null;
  	}
  }
}
