test;
[p] {
[As]
    package p;
  /** typecomment template*/
  public class As {
  	void f(){
  		A a= A.getA();
  		a.m1();
  	}
  }
[I]
    package p;
  /** typecomment template*/
  interface I {
  	void m();
  }
[A]
    package p;
  class A implements I {
  	static A getA(){
  		return null;
  	}
  	public void m(){}
  	public void m1(){}
  }
}
