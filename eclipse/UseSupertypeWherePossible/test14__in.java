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
  	public void m(){}
  	void f(){
  		A a= new A();
  		a.m();
  	}
  }
}
