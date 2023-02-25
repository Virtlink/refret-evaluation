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
  	protected A g() {
  		return this;	
  	}
  }
  class A1 extends A{
  	protected A g() {
  		return this;	
  	}
  }
}
