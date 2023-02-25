test;
[p] {
[I]
    package p;
  /** typecomment template*/
  interface I {
  	void m();
  	void m1();
  }
[A]
    package p;
  
  class A implements I {
  	public void m(){}
  	public void m1(){}
  	void f(){
  		A a= new A();
  		a.m();
  	}
  }
}
