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
  	void g() {
  		I a= (I)new A();
  		((A)this).m1();
  		((I)this).m();
  		(((I)this)).m();
  	}
  }
}
